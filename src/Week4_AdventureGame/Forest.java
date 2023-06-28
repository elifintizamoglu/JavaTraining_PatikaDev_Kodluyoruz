package Week4_AdventureGame;

public class Forest extends BattleLoc{
    public Forest(Player player) {
        super(player, "Forest", new Vampire(), "firewood",3);
    }
}
