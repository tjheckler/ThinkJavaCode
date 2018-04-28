public class Player
{
    private String name;
    private int score;

    public Player(String name, int score)
    {
        score = 0;
        this.name = name;
        this.score = score;
    }

    public int increaseScore()
    {
        return score = score+1;
    }
    public int resetScore()
    {
       return score = 0;
    }

    public int getScore()
    {
        return score;
    }

    public String getName()
    {
        return name;
    }
}
