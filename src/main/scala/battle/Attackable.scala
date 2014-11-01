package battle;

import core.Game;

trait Attackable {
  val game: Game;
  val maxHealth: Int;
  private var health = maxHealth;
  def attack(enemy: Attackable, weapon: Weapon) {
    if (scala.util.Random.nextInt(100) < weapon.accuracy) { // hit!
      enemy.health = math.max(enemy.health - weapon.power, 0);
      hit(enemy);
      weapon.decay;
      enemy.wasHitBy(this, weapon.name, weapon.power);
      if (enemy.health == 0) {
        killed(enemy);
        enemy.wasKilled();
      }
    } else { // miss!
      missed(enemy);
      enemy.wasMissedBy(this, weapon.name);
    }
  }
  def heal(amount: Int) {
    if (amount > 0) {
      health = math.min(health + amount, maxHealth);
      wasHealed(amount);
    }
  }
  protected def hit(enemy: Attackable);
  protected def missed(enemy: Attackable);
  protected def killed(enemy: Attackable);
  protected def wasHitBy(enemy: Attackable, weaponName: String, damage: Int);
  protected def wasMissedBy(enemy: Attackable, weaponName: String);
  protected def wasKilled();
  protected def wasHealed(amount: Int);
}
