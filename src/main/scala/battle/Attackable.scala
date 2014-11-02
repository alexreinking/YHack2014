package battle;

trait Attackable {
  val baseAccuracy: Int;
  val basePower: Int;
  val maxHealth: Int;

  // Hackathon; don't judge
  private var gameStarted = false;
  private var _health = maxHealth;
  def health: Int = {
    if (!gameStarted) {
      _health = maxHealth;
      gameStarted = true;
    }
    return _health;
  }

  def attack(enemy: Attackable, weaponOpt: Option[Weapon]) {
    val accuracy = weaponOpt.map(_.accuracy).getOrElse(baseAccuracy);
    val power = weaponOpt.map(_.power).getOrElse(basePower);
    if (scala.util.Random.nextInt(100) < accuracy) { // hit!
      enemy._health = math.max(enemy.health - power, 0);
      hit(enemy);
      weaponOpt.foreach(_.decay);
      enemy.wasHitBy(this, power, weaponOpt.map(_.name));
      if (enemy.health == 0) {
        killed(enemy);
        enemy.wasKilled();
      }
    } else { // miss!
      missed(enemy);
      enemy.wasMissedBy(this, weaponOpt.map(_.name));
    }
  }
  def heal(amount: Int) {
    if (amount > 0) {
      _health = math.min(health + amount, maxHealth);
      wasHealed(amount);
    }
  }
  protected def hit(enemy: Attackable);
  protected def missed(enemy: Attackable);
  protected def killed(enemy: Attackable);
  protected def wasHitBy(
    enemy: Attackable,
    damage: Int,
    weaponNameOpt: Option[String]
  );
  protected def wasMissedBy(enemy: Attackable, weaponNameOpt: Option[String]);
  protected def wasKilled();
  protected def wasHealed(amount: Int);
}
