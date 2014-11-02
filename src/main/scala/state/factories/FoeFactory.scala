package state.factories;

import battle.Weapon;
import battle.factories.WeaponFactory;
import battle.FightingNature.{ Passive, Defensive, Aggressive }
import state.{ Foe, Game };

class FoeFactory {
  def buildDragon(game: Game): Foe = new Foe(
    game = game,
    maxHealth = 200,
    basePower = 30,
    baseAccuracy = 70,
    nature = Aggressive,
    weaponOpt = None
  );
 
  def buildTroll(game: Game): Foe = new Foe(
    game = game,
    maxHealth = 75,
    nature = Defensive,
    weaponOpt = Some(WeaponFactory.buildBronzeSword(None))
  );
  
  def buildAssassin(game: Game): Foe = new Foe(
    game = game,
    maxHealth = 80,
    nature = Aggressive,
    weaponOpt = Some(WeaponFactory.buildElvishSword(None))
  );
  
  def buildGnome(game: Game): Foe = new Foe(
    game = game,
    maxHealth = 50,
    nature = Passive,
    weaponOpt = Some(WeaponFactory.buildLongBow(None))
  );
}
