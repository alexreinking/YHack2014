package core;

import battle.{ Attackable, FightingNature, Weapon }
import battle.FightingNature.{ Passive, Defensive, Aggressive }

class Foe(
  val maxHealth: Int,
  val game: Game,
  val nature: FightingNature,
  val weapon: Weapon
) extends Attackable {
  protected def hit(enemy: Attackable) { }
  protected def missed(enemy: Attackable) { }
  protected def killed(enemy: Attackable) { }
  protected def wasHealed(amount: Int) { }

  protected def wasHitBy(enemy: Attackable, weaponName: String, damage: Int) {
    if (nature != Passive) {
      attack(enemy, weapon);
    }
  }
  protected def wasMissedBy(enemy: Attackable, weaponName: String) {
    if (nature != Passive) {
      attack(enemy, weapon);
    }
  }
  protected def wasKilled() {
    game.killFoe(this);
  }
}
