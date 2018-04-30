package com.company;

public class FinishLine
{
    private Peg bluePeg;
    private Peg redPeg;

    private Die dieOne;
    private Die dieTwo;

    public FinishLine()
    {
        bluePeg = new Peg();
        redPeg = new Peg();

        dieOne = new Die();
        dieTwo = new Die();
    }

    public void play()
    {
        System.out.println("Starting Game Finish Line");

        do
        {
            takeTurn(bluePeg);
            takeTurn(redPeg);
            printGameStatus();
        }
        while(!bluePeg.isWinner() && !redPeg.isWinner());

        if (bluePeg.isWinner())
        {
            System.out.println("Blue Wins!");
        }
        if( redPeg.isWinner())
        {
            System.out.println("Red Wins!");
        }
    }

    private void takeTurn(Peg peg)
    {
        dieOne.roll();
        dieTwo.roll();

        if (peg.getNextPosition() == dieOne.getValue() ||
                peg.getNextPosition() == dieTwo.getValue()||
                peg.getNextPosition() == dieTwo.getValue()+dieOne.getValue() )
        {
            peg.moveForward();
        }
    }
    //RoundAbout

    private void printGameStatus()
    {
        System.out.println("Blue peg at: "+bluePeg.getPosition());
        System.out.println("Red peg at: "+redPeg.getPosition());
    }
    public void reset()
    {
        bluePeg.reset();
        redPeg.reset();
    }
}
