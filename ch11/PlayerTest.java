public class PlayerTest
{
    public static void main(String[]args)
    {
        Player player;
        player = new Player("Josh",4);
        System.out.println(player.getName()+" entered the game with score at "+player.getScore());
        System.out.println(player.getName()+" scored a point! increased score to "+player.increaseScore());
        System.out.println(player.getName()+" cheated, score is now reset to "+player.resetScore());
    }
}
