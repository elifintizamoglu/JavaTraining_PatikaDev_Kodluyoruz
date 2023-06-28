package Week4_AdventureGame.Locations;

import Week4_AdventureGame.Characters.Player;

public class SafeHouse extends NormalLoc {
    public SafeHouse(Player player) {
        super(player, "Safe House");
    }
    @Override
    public boolean onLocation(){
        System.out.println("You are in the safe house.");
        System.out.println("You health is fulled.");
        this.getPlayer().setHealth(this.getPlayer().getOriginalHealth());
        return true;
    }
}
