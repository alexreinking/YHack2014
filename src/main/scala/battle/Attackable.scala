package battle;

import scala.util.Random;

trait Attackable {
  private var _health = 0;
  private val _maxHealth = 0;
  def attack(enemy: Attackable, weapon: Weapon) {
    if (Random.nextInt(100) < weapon.accuracy) { // hit!
      enemy._health = math.max(enemy._health - weapon.power, 0);
      hit(enemy);
      enemy.wasHitBy(enemy, weapon.name, weapon.power);
      if (enemy._health == 0) {
        killed(enemy);
        enemy.wasKilled();
      }
    } else { // miss!
      missed(enemy);
      enemy.wasMissedBy(enemy, weapon.name);
    }
  }
  protected def hit(enemy: Attackable);
  protected def missed(enemy: Attackable);
  protected def killed(enemy: Attackable);
  protected def wasHitBy(enemy: Attackable, weaponName: String, damage: Int);
  protected def wasMissedBy(enemy: Attackable, weaponName: String);
  protected def wasKilled();
}
