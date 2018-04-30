package com.company;

public class RoundAbout
{
    private Peg2 bluePeg2;
    private Peg2 redPeg2;

    private Die dieOne;
    private Die dieTwo;

    public RoundAbout()
    {
        bluePeg2 = new Peg2();
        redPeg2 = new Peg2();
        dieOne = new Die();
        dieTwo = new Die();
    }

    public void play()
    {
        System.out.println("Starting Game");

        do
        {
            takeTurn2(bluePeg2,redPeg2);
            takeTurn2(redPeg2,bluePeg2);
            printGameStatus();
        }
        while (!bluePeg2.isWinner() && !redPeg2.isWinner());

        if (bluePeg2.isWinner())
        {
            System.out.println("Blue Wins!");
        }
        if (redPeg2.isWinner())
        {
            System.out.println("Red Wins!");
        }
    }

    private void takeTurn2(Peg2 peg2, Peg2 opponentPeg)
    {
        dieOne.roll();
        dieTwo.roll();

        if (peg2.getNextRollValueNeeded() == dieOne.getValue() ||
                peg2.getNextRollValueNeeded() == dieTwo.getValue() ||
                peg2.getNextRollValueNeeded() == dieTwo.getValue() + dieOne.getValue())
        {
            peg2.moveForward();
            if (peg2.getPosition()== opponentPeg.getPosition())
            {
                System.out.println("Move it buddy!");
                opponentPeg.resetToZero();
            }
        }
    }



    private void printGameStatus()
    {
        System.out.println("Blue peg at: " + bluePeg2.getPosition());
        System.out.println("Red peg at: " + redPeg2.getPosition());
    }


    public void resetToZero()
    {
        bluePeg2.resetToZero();
        redPeg2.resetToZero();
    }

}
