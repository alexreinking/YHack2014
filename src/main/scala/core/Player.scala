package core

import javax.websocket.Session

import battle.Attackable
import location.Location
import server.messages.RequestMessage
import utils.Strings.addArticle
import scala.collection.JavaConverters._

class Player(val name: String,
             val session: Session,
             val game: Game,
             protected var _location: Location
              ) extends Attackable with Notifiable with Movable with HasName {
  val maxHealth = 100
  val basePower = 5
  val baseAccuracy = 100
  private val _inventory = scala.collection.mutable.ListBuffer.empty[Item]

  def giveItem(player: Player, itemName: String, indexOpt: Option[Int] = None) {
    val matchingItems = indexOpt
      .map(index => inventory.filter(_.name == itemName).lift(index).toList)
      .getOrElse(inventory.filter(_.name == itemName))

    if (matchingItems.isEmpty) {
      sendFailure("You don't have " + addArticle(itemName) + " to trade.")
    } else if (matchingItems.size == 1) {
      matchingItems.lift(0).foreach(item => {
        _inventory -= item
        player._inventory += item
        player.sendSuccess("Received " + addArticle(item) + " from " + this)
        sendSuccess("Sent " + addArticle(item) + " to " + player)
      })
    } else {
      sendItemSpecificationRequest(player, matchingItems)
    }
  }

  def inventory = _inventory.toList

  private def sendItemSpecificationRequest(player: Player, items: List[Item]) {
    session.getBasicRemote.sendObject(new RequestMessage("choose", items.map(_.name).asJava, -1))
  }

  protected def hit(enemy: Attackable) {
    notify("Attacked " + enemy + ".")
  }

  protected def missed(enemy: Attackable) {
    notify("You missed!")
  }

  protected def killed(enemy: Attackable) {
    sendSuccess("You have slain " + enemy + "! You win all the glory!")
  }

  protected def wasHitBy(
    enemy: Attackable,
    damage: Int,
    weaponNameOpt: Option[String]
  ) {
    val withClause = weaponNameOpt.map(" with " + addArticle(_)).getOrElse("")
    alert(enemy + " attacked you" + withClause + "! (-" + damage + ")")
  }

  protected def wasMissedBy(enemy: Attackable, weaponNameOpt: Option[String]) {
    val withClause = weaponNameOpt.map(" with " + addArticle(_)).getOrElse("")
    alert(enemy + " attacked you" + withClause + " but missed!")
  }

  protected def wasKilled() {
    alert("Oh dear. It seems you have died.")
    game.killPlayer(this)
  }

  protected def wasHealed(amount: Int) {
    notify("You have been healed (+" + amount + ")")
  }

}
