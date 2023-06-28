package Week4_AdventureGame;

import java.util.Random;

public class Mine extends BattleLoc{

    private Random r = new Random();

    public Mine(Player player) {
        super(player, "Mine", new Snake(), null, 5);
    }
}
