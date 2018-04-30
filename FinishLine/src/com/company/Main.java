package com.company;

public class Main {

    public static void main(String[] args)
    {

        FinishLine game = new FinishLine();

            game.play();
            game.reset();


        System.out.println();
        System.out.println();


        RoundAbout game2 = new RoundAbout();


        game2.play();
        game2.resetToZero();
    }


}
