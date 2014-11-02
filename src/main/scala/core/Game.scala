package core

import location.{ Location, LocationState }

class Game {
  private val worldMap = initializeRooms;

  def killFoe(foe: Foe) {
    worldMap.get(foe.location).foreach(_.remove(foe));
  }

  def killPlayer(player: Player) {
    worldMap.get(player.location).foreach(_.remove(player));
  }

  private def initializeRooms: Map[Location, LocationState] = {
    // initialize the dungeon's rooms here.
    Map.empty[Location, LocationState];
  }

  // Should not be directly invoked.  Use the mover's own move() method.
  def move(
    mover: Movable,
    oldLocation: Location,
    newLocation: Location
  ): Boolean = (for {
    oldState <- worldMap.get(oldLocation)
    newState <- worldMap.get(newLocation)
  } yield mover match {
    case player: Player if oldState.contains(player) => {
      oldState.remove(player);
      newState.add(player);
      true;
    }
    case foe: Foe if oldState.contains(foe) => {
      oldState.remove(foe);
      newState.add(foe);
      true;
    }
    case _ => false;
  }).getOrElse(false);
}
