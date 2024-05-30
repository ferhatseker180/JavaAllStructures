package week4.AdventureGame.AdventureGame.src;

public class Cave extends BattleLocation{
    public Cave(Player player) {
        super(player, "Cave", new Zombie(), "Food",3);
    }
}
