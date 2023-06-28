package Week4_AdventureGame.Locations;

import Week4_AdventureGame.Beasts.Bear;
import Week4_AdventureGame.Characters.Player;

public class River extends BattleLoc {
    public River(Player player) {
        super(player, "River", new Bear(), "water",2);
    }
}
