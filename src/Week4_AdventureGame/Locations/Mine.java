package Week4_AdventureGame.Locations;

import Week4_AdventureGame.Characters.Player;
import Week4_AdventureGame.Beasts.Snake;

import java.util.Random;

public class Mine extends BattleLoc {

    private Random r = new Random();

    public Mine(Player player) {
        super(player, "Mine", new Snake(), null, 5);
    }
}
