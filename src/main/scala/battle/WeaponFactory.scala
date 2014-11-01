package battle;

import core.Item;

object WeaponFactory {
  def buildBronzeSword(decayCallbackOpt: Option[() => Unit]) = new Weapon(
    name = "bronze sword",
    description = "a rusty bronze sword",
    value = 10,
    power = 5,
    accuracy = 90,
    decayOpt = None,
    decayCallbackOpt = decayCallbackOpt
  )

  def buildMorningStar(decayCallbackOpt: Option[() => Unit]) = new Weapon(
    name = "morning star",
    description = "a mace with iron spikes",
    value = 15,
    power = 9,
    accuracy = 70,
    decayOpt = Some(10),
    decayCallbackOpt = decayCallbackOpt
  )

  def buildGreatAxe(decayCallbackOpt: Option[() => Unit]) = new Weapon(
    name = "great axe",
    description = "a fearsome two-handed axe",
    value = 30,
    power = 20,
    accuracy = 60,
    decayOpt = Some(10),
    decayCallbackOpt = decayCallbackOpt
  )

  def buildLongBow (decayCallbackOpt: Option[() => Unit]) = new Weapon(
    name = "longbow",
    description = "a bow made from mahogany wood",
    value = 25,
    power = 10,
    accuracy = 80,
    decayOpt = Some(15),
    decayCallbackOpt = decayCallbackOpt
  )

  def buildElvishSword (decayCallbackOpt: Option[() => Unit]) = new Weapon(
    name = "elvish sword",
    description = "a highly accurate, elven-made broadsword",
    value = 30,
    power = 10,
    accuracy = 100,
    decayOpt = Some(20),
    decayCallbackOpt = decayCallbackOpt
  )

  def buildJarOfJapaneseGiantHornets (decayCallbackOpt: Option[() => Unit]) = new Weapon (
    name = "a jar of japanese giant hornets",
    description = "what the hell are these things?",
    value = 100,
    power = 100,
    accuracy = 100,
    decayOpt = Some(1),
    decayCallbackOpt = decayCallbackOpt
  )

}
