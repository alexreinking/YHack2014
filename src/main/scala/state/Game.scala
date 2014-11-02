package state;

import location.Location;
import utils.OptionUtils.optional2Option;

class Game {
  private val worldMap = initializeRooms;
  private val playerLocations =
    scala.collection.mutable.Map.empty[Player, Location];
  private val foeLocations =
    scala.collection.mutable.Map.empty[Foe, Location];

  def killPlayer(player: Player) {
    playerLocations.get(player).flatMap(worldMap.get).foreach(_.remove(player));
  }

  def killFoe(foe: Foe) {
    foeLocations.get(foe).flatMap(worldMap.get).foreach(_.remove(foe));
  }

  private def initializeRooms: Map[Location, LocationState] = {
    // initialize the dungeon's rooms here.
    Map.empty[Location, LocationState];
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
}
