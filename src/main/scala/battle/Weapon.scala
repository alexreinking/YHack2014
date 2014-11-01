package battle;

import core.Item;

class Weapon(
  name: String,
  description: String,
  value: Int,
  val power: Int,
  val accuracy: Int, // percentage
  var decay: Option[Int]
) extends Item(name, description, value);
