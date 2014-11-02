package state;

import battle.{ Attackable, FightingNature, Weapon }
import battle.FightingNature.{ Passive, Defensive, Aggressive }
import core.HasName

class Foe(
  val name: String,
  val game: Game,
  val maxHealth: Int,
  val basePower: Int = 5,
  val baseAccuracy: Int = 100,
  val nature: FightingNature = Defensive,
  val weaponOpt: Option[Weapon] = None
) extends Attackable with HasName {
  protected def hit(enemy: Attackable) { }
  protected def missed(enemy: Attackable) { }
  protected def killed(enemy: Attackable) { }
  protected def wasHealed(amount: Int) { }

  protected def wasHitBy(
    enemy: Attackable,
    damage: Int,
    weaponNameOpt: Option[String]
  ) {
    if (nature != Passive) {
      attack(enemy, weaponOpt);
    }
  }
  protected def wasMissedBy(enemy: Attackable, weaponNameOpt: Option[String]) {
    if (nature != Passive) {
      attack(enemy, weaponOpt);
    }
  }
  protected def wasKilled() {
    game.killFoe(this);
  }
}
