package Week4_AdventureGame.Locations;

import Week4_AdventureGame.Characters.Player;
import Week4_AdventureGame.Beasts.Zombie;

public class Cave extends BattleLoc {
    public Cave(Player player) {
        super(player, "Cave", new Zombie(),"food",3);
    }
}
