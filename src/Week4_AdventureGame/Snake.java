package Week4_AdventureGame;

import java.util.Random;

public class Snake extends Obstacle {
    public static int DAMAGE;

    static {
        DAMAGE = (int) (Math.random() * 4 + 3);
    }

    public Snake() {
        super(4, "Snake", DAMAGE, 12, 0);
    }
}
