package com.company;

public class DieTester
{
    public static void main(String[] args)
    {
        Die die = new Die();
        Die die1 = new Die();

        // System.out.println(die.getValue());
        die.roll();
        die1.roll();
        System.out.println(die.getValue());
        System.out.println(die1.getValue());

    }


}
