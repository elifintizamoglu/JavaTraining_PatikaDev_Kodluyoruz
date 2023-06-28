package Week4_AdventureGame.Locations;

import Week4_AdventureGame.Characters.Player;
import Week4_AdventureGame.Beasts.Vampire;

public class Forest extends BattleLoc {
    public Forest(Player player) {
        super(player, "Forest", new Vampire(), "firewood",3);
    }
}
