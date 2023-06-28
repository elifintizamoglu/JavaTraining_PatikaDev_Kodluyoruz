package Week4_AdventureGame.Locations;

import Week4_AdventureGame.Characters.Player;

import java.util.Scanner;

public abstract class Location {
    Player player;
    String name;
    public static Scanner input = new Scanner(System.in);

    public Location(Player player, String name) {
        this.player = player;
        this.name = name;
    }

    public abstract boolean onLocation();

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
