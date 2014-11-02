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
    return Map.empty[Location, LocationState];
  }

  // Should not be directly invoked.  Use the mover's own move() method.
  def move(
    mover: Movable,
    oldLocation: Location,
    newLocation: Location
  ): Boolean = (for {
    oldState <- worldMap.get(oldLocation)
    newState <- worldMap.get(newLocation)
  } yield {
    if (mover.isInstanceOf[Player]) {
      if (oldState.contains(mover.asInstanceOf[Player])) {
        oldState.remove(mover.asInstanceOf[Player]);
        newState.add(mover.asInstanceOf[Player]);
        true;
      }
    } else if (mover.isInstanceOf[Foe]) {
      if (oldState.contains(mover.asInstanceOf[Foe])) {
        oldState.remove(mover.asInstanceOf[Foe]);
        newState.add(mover.asInstanceOf[Foe]);
        true;
      }
    }
    false;
  }).getOrElse(false);
}
