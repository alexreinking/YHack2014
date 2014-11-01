package core;

import location.Location;

class Game {
  private val _locationMap =
    scala.collection.mutable.Map.empty[Player, Location];
  
  def getCurrentLocation(player: Player): Option[Location] = {
    _locationMap.get(player);
  }
}
