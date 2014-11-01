package core;

import battle.Weapon;
import battle.WeaponFactory;
import scala.Option;
import battle.FightingNature;

class FoeFactory {
    public static Foe buildTroll (Game game) {
        return new Foe(75, game, FightingNature.Aggressive, WeaponFactory.buildBronzeSword(Option.empty()));
    }
    public static Foe buildAssassin (Game game) {
        return new Foe(80, game, FightingNature.Aggressive, WeaponFactory.buildElvishSword(Option.empty()));
    }
    public static Foe buildGnome (Game game) {
        return new Foe (50, game, FightingNature.Passive, WeaponFactory.buildLongBow(Option.empty()));
    }

}