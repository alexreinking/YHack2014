package battle;

import core.Item;

class Weapon(
  name: String,
  description: String,
  value: Int,
  val power: Int,
  val accuracy: Int, // percentage
  private var decayOpt: Option[Int] = None,
  decayCallbackOpt: Option[() => Unit] = None
) extends Item(name, description, value) {
  def decay = decayOpt.foreach(decay => {
    if (decay > 0) {
      decayOpt = Some(decay - 1);
      if (decay == 1 && decayCallbackOpt.isDefined) {
        decayCallbackOpt.foreach(_.apply());
      }
    }
  });
}
