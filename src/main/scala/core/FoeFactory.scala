package core;

import battle.{ Weapon, WeaponFactory }
import battle.FightingNature.{ Passive, Defensive, Aggressive }
import location.Location;

class FoeFactory {
  def buildDragon(game: Game, location: Location): Foe = new Foe(
    game = game,
    _location = location,
    maxHealth = 200,
    basePower = 30,
    baseAccuracy = 70,
    nature = Aggressive,
    weaponOpt = None
  );
 
  def buildTroll(game: Game, location: Location): Foe = new Foe(
    game = game,
    _location = location,
    maxHealth = 75,
    nature = Defensive,
    weaponOpt = Some(WeaponFactory.buildBronzeSword(None))
  );
  
  def buildAssassin(game: Game, location: Location): Foe = new Foe(
    game = game,
    _location = location,
    maxHealth = 80,
    nature = Aggressive,
    weaponOpt = Some(WeaponFactory.buildElvishSword(None))
  );
  
  def buildGnome(game: Game, location: Location): Foe = new Foe(
    game = game,
    _location = location,
    maxHealth = 50,
    nature = Passive,
    weaponOpt = Some(WeaponFactory.buildLongBow(None))
  );
}
