package core;

import core.MessageType.{ Notification, Success, Failure, Warning, Alert }
import location.Location;
import utils.Strings.addArticle;

trait Attackable {}

class Weapon(
  name: String,
  description: String,
  value: Int,
  power: Int,
  decay: Option[Int]
) extends Item(name, description, value);

class Player(val name: String, val game: Game) extends Attackable {
  private val _inventory = scala.collection.mutable.ListBuffer.empty[Item];
  def inventory = _inventory.toList;
  def currentRoom = game.getCurrentRoom(this);
  def attack(enemy: Attackable, weapon: Weapon) {}
  def giveItem(player: Player, itemName: String, indexOpt: Option[Int] = None) {
    val matchingItems = indexOpt
      .map(index => inventory.filter(_.getName == itemName).lift(index).toList)
      .getOrElse(inventory.filter(_.getName == itemName));
    if (matchingItems.isEmpty) {
      sendFailure("You don't have " + addArticle(itemName) + " to trade.");
    } else if (matchingItems.size == 1) {
      matchingItems.lift(0).foreach(item => {
        _inventory -= item;
        player._inventory += item;
        player.sendSuccess("Received " + addArticle(itemName) +
          " from " + this.name);
        sendSuccess("Sent " + addArticle(itemName) + " to " + player.name);
      });
    } else {
      sendItemSpecificationRequest(player, matchingItems);
    }
  }
  def sendItemSpecificationRequest(player: Player, items: List[Item]) {
    // web hook to requeest specification
  }
  private def sendSuccess(message: String) {
    notify(message, Success);
  }
  private def sendFailure(message: String) {
    notify(message, Failure);
  }
  private def alert(message: String) {
    notify(message, Alert);
  }
  private def warn(message: String) {
    notify("[Warning] " + message, Warning);
  }
  private def notify(message: String, messageType: MessageType = Notification) {
    // web hook to notify player
  }
}

class Game {
  private val _locationMap = scala.collection.mutable.Map.empty[Player, Location];
  def getCurrentRoom(player: Player): Option[Location] = _locationMap.get(player);
}
