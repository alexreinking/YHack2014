package core;

import location.Location;

trait Movable {
  val game: Game;
  protected var _location: Location;
  def location = _location;
  def move(direction: String): Boolean = {
    if (location.canGoTo(direction)) {
      val newLocation = location.goTo(direction);
      if (game.move(this, location, newLocation)) {
        _location = newLocation;
        return true;  
      }
    }
    return false;
  }
}
