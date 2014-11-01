package core;

import battle.Attackable;
import utils.Strings.addArticle;

class Player(val name: String, val game: Game)
extends Attackable with Notifiable with HasName {
  private val _inventory = scala.collection.mutable.ListBuffer.empty[Item];
  val maxHealth = 100;
  def inventory = _inventory.toList;
  def currentLocation = game.getCurrentLocation(this);
  def giveItem(player: Player, itemName: String, indexOpt: Option[Int] = None) {
    val matchingItems = indexOpt
      .map(index => inventory.filter(_.name == itemName).lift(index).toList)
      .getOrElse(inventory.filter(_.name == itemName));
    if (matchingItems.isEmpty) {
      sendFailure("You don't have " + addArticle(itemName) + " to trade.");
    } else if (matchingItems.size == 1) {
      matchingItems.lift(0).foreach(item => {
        _inventory -= item;
        player._inventory += item;
        player.sendSuccess("Received " + addArticle(item) + " from " + this);
        sendSuccess("Sent " + addArticle(item) + " to " + player);
      });
    } else {
      sendItemSpecificationRequest(player, matchingItems);
    }
  }

  private def sendItemSpecificationRequest(player: Player, items: List[Item]) {
    // web hook to request specification
  }

  protected def hit(enemy: Attackable) {
    notify("Attacked " + enemy +".");
  }

  protected def missed(enemy: Attackable) {
    notify("You missed!")
  }

  protected def killed(enemy: Attackable) {
    sendSuccess("You have slain " + enemy + "! You win all the glory!");
  }

  protected def wasHitBy(enemy: Attackable, weaponName: String, damage: Int) {
    alert(enemy + " attacked you with " + addArticle(weaponName) +
      "! (-" + damage + ")");
  }

  protected def wasMissedBy(enemy: Attackable, weaponName: String) {
    alert(enemy + " attacked you with " + addArticle(weaponName) +
      " but missed!");
  }

  protected def wasKilled() {
    alert("Oh dear.  It seems you have died.");
  }

  protected def wasHealed(amount: Int) {
    notify("You have been healed (+" + amount +")");
  }

}
