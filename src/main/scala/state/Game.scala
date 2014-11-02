package state;

import core.Item
import location.{Room, Location}
import javax.websocket.Session;
import scala.util.Random;
import utils.OptionUtils.optional2Option;

class Game {
  private val (worldMap, startingLocations) = initializeMap;
  private val playerLocations =
    scala.collection.mutable.Map.empty[Player, Location];
  private val foeLocations =
    scala.collection.mutable.Map.empty[Foe, Location];

  // add the initial items
  worldMap.headOption.foreach(_._2.add(new Item("Holy Grail", "Only the holiest of the grails", 1000000)));

  def killPlayer(player: Player) {
    playerLocations.get(player).flatMap(worldMap.get).foreach(_.remove(player));
    playerLocations.remove(player);
  }

  def killFoe(foe: Foe) {
    foeLocations.get(foe).flatMap(worldMap.get).foreach(_.remove(foe));
    foeLocations.remove(foe);
  }

  def addPlayer(name: String, session: Session): Boolean = {
    if (playerLocations.keySet.exists(_.name == name)) {
      return false;
    }

    val startingLocation = startingLocations(Random.nextInt(startingLocations.size));
    val player = new Player(name, session, this);
    session.getUserProperties.put("player", player);

    playerLocations.put(player, startingLocation);
    worldMap.get(startingLocation).foreach(_.add(player));
    // tell the player the description
    player.notify(startingLocation.getDescription)

    return true;
  }

  private def initializeMap: (Map[Location, LocationState], List[Location]) = {
    // This should be changed to generate maps we actually want...
    val start1 = new Room("start room 1", "The first starting room");
    val start2 = new Room("start room 2", "The more evil starting room");
    val camelot = new Room("Camelot", "Tis a silly place");
    val foo = new Room("foo", "This is the palace of foo");
    val clam = new Room("drunken clam", "Giggity");
    val bar = new Room("bar", "Tis the bar");

    start1.setEast(camelot);
    start1.setSouth(foo);
    start2.setNorth(foo);
    foo.setWest(bar);
    bar.setWest(clam);
    clam.setWest(foo);

    val startingLocations = List(start1, start2);
    val allLocations = startingLocations ++: List(camelot, foo, clam, bar);
    return (allLocations.map(loc => (loc, new LocationState())).toMap, startingLocations);
  }

  def move(player: Player, direction: String) {
    for {
      oldLocation <- playerLocations.get(player)
      newLocation <- oldLocation.getNeighbor(direction)
      oldState <- worldMap.get(oldLocation)
      newState <- worldMap.get(newLocation)
      if oldState.contains(player)
    } {
      oldState.remove(player);
      newState.add(player);

      player.notify(newLocation.getDescription)
      player.notify(newState.getDescription)

      playerLocations.put(player, newLocation);
    }
  }

  def move(foe: Foe, direction: String) {
    for {
      oldLocation <- foeLocations.get(foe)
      newLocation <- oldLocation.getNeighbor(direction)
      oldState <- worldMap.get(oldLocation)
      newState <- worldMap.get(newLocation)
      if oldState.contains(foe)
    } {
      oldState.remove(foe);
      newState.add(foe);
      foeLocations.put(foe, newLocation);
    }
  }

  def take(player: Player, itemName: String) {
    for {
      location <- playerLocations.get(player)
      state <- worldMap.get(location)
      item <- state.getItemWithName(itemName)
    } {
      player.addItem(item);
      state.remove(item);
    }
  }
}
