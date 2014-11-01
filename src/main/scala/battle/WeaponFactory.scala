package battle;

import core.Item;

object WeaponFactory {
  def buildBronzeSword(decayCallbackOpt: Option[() => Unit]) = new Weapon(
    name = "bronze sword",
    description = "a rusty bronze sword",
    value = 10,
    power = 5,
    accuracy = 100,
    decayOpt = None,
    decayCallbackOpt = decayCallbackOpt
  );
}
