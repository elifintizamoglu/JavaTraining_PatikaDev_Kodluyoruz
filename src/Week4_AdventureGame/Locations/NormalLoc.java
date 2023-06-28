package Week4_AdventureGame.Locations;

import Week4_AdventureGame.Characters.Player;
import Week4_AdventureGame.Locations.Location;

public abstract class NormalLoc extends Location {

    public NormalLoc(Player player, String name){
        super(player,name);
    }
    @Override
    public boolean onLocation(){
        return true;
    }
}
