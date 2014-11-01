package battle;

import core.Item;

class Weapon(
  override val name: String,
  override val description: String,
  override val value: Int,
  val power: Int,
  val accuracy: Int, // percentage
  private var decayOpt: Option[Int] = None,
  private val decayCallbackOpt: Option[() => Unit] = None
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
