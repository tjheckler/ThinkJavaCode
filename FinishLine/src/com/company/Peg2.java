package com.company;

public class Peg2
{
    private int position;

    public Peg2()
    {
        resetToZero();

    }

    public int getPosition()
    {
        return position;
    }

    public void moveForward()
    {
        position++;
    }

    public int getNextRollValueNeeded()
    {
        if (position == 0)
        {
            return 5;

        }
        else
        {
            return position +1;
        }
    }

    public boolean isWinner()
    {
        return position >= 11;
    }

    public void resetToZero()
    {
        position = 0;
    }

}

