package week4.AdventureGame.AdventureGame.src;

public class Forest extends BattleLocation{
    public Forest(Player player) {
        super(player, "Forest", new Vampire(),"Firewood",3);
    }
}
