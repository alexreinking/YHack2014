package state;

import battle.Attackable;
import core.{ HasName, Item, Notifiable };
import javax.websocket.Session;
import scala.collection.JavaConverters._;
import server.messages.RequestMessage;
import utils.StringUtils.addArticle;

class Player(
  val name: String,
  val session: Session,
  val game: Game
) extends Attackable with Notifiable with HasName {
  def addItem(item: Item) {
    _inventory += item;
    sendSuccess("You have acquired " + addArticle(item.name));
  }

  val maxHealth = 100;
  val basePower = 5;
  val baseAccuracy = 100;

  private val _inventory = scala.collection.mutable.ListBuffer.empty[Item];
  def inventory = _inventory.toList;
  
  def giveItem(otherPlayer: Player, itemName: String, indexOpt: Option[Int] = None) {
    val matchingItems = indexOpt
      .map(index => inventory.filter(_.name.equalsIgnoreCase(itemName)).lift(index).toList)
      .getOrElse(inventory.filter(_.name.equalsIgnoreCase(itemName)));
    if (matchingItems.isEmpty) {
      sendFailure("You don't have " + addArticle(itemName) + " to trade.");
    } else if (matchingItems.size == 1) {
      matchingItems.lift(0).foreach(item => {
        _inventory -= item;
        otherPlayer._inventory += item;
        otherPlayer.sendSuccess("Received " + addArticle(item) + " from " + this);
        sendSuccess("Sent " + addArticle(item) + " to " + otherPlayer);
      })
    } else {
      sendItemSpecificationRequest(matchingItems);
    }
  }

  def dropItem(itemName: String, indexOpt: Option[Int] = None) {
    val matchingItems = indexOpt
      .map(index => inventory.filter(_.name.equalsIgnoreCase(itemName)).lift(index).toList)
      .getOrElse(inventory.filter(_.name.equalsIgnoreCase(itemName)));
    if (matchingItems.isEmpty) {
      sendFailure("You don't have " + addArticle(itemName) + " to drop.");
    } else if (matchingItems.size == 1) {
      matchingItems.lift(0).foreach(item => {
        _inventory -= item;
        notify("Dropped " + addArticle(item));
      })
    } else {
      sendItemSpecificationRequest(matchingItems);
    }
  }

  private def sendItemSpecificationRequest(items: List[Item]) {
    session.getBasicRemote.sendObject(
      new RequestMessage("choose", items.map(_.name).asJava, -1)
    );
  }

  protected def hit(enemy: Attackable) {
    notify("Attacked " + enemy + ".");
  }

  protected def missed(enemy: Attackable) {
    notify("You missed!");
  }

  protected def killed(enemy: Attackable) {
    sendSuccess("You have slain " + enemy + "! You win all the glory!");
  }

  protected def wasHitBy(
    enemy: Attackable,
    damage: Int,
    weaponNameOpt: Option[String]
  ) {
    val withClause = weaponNameOpt.map(" with " + addArticle(_)).getOrElse("");
    alert(enemy + " attacked you" + withClause + "! (-" + damage + ")");
  }

  protected def wasMissedBy(enemy: Attackable, weaponNameOpt: Option[String]) {
    val withClause = weaponNameOpt.map(" with " + addArticle(_)).getOrElse("");
    alert(enemy + " attacked you" + withClause + " but missed!");
  }

  protected def wasKilled() {
    alert("Oh dear. It seems you have died.");
    game.killPlayer(this)
  }

  protected def wasHealed(amount: Int) {
    notify("You have been healed (+" + amount + ")");
  }

}
