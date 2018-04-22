import java.util.Scanner;

public class GreenCoffeeGrowers
{
    public static void main(String[] args)
    {
        int commute;
        int miles;


        Scanner in = new Scanner(System.in);

        System.out.println("How do  you commute?");
        System.out.println("Please type (1) for bus, (2) for bike, (3) for car, or (4) Don't commute, proceed to checkout ");
        commute = in.nextInt();
        System.out.println("How many miles? ");
        miles = in.nextInt();


        if (commute > 4 || commute < 1)
        {
            System.out.println("Invalid Selection, Please Try again!");
        } else
        {
            switch (commute)
            {
                        //Bus commute
                case 1:
                    if (commute == 1)
                    {
                        if (miles < 21)
                        {
                            System.out.println("You receive a free coffee");
                        }
                        else if (miles >= 21 && miles < 35  )
                        {
                            System.out.println("You receive a free coffee and a 20% discount");
                        }
                        else if (miles >= 35 && miles <= 50  )
                        {
                            System.out.println("You receive a free coffee and a 30% discount");
                        }

                        else if (miles > 50)
                        {
                            System.out.println("You receive a free coffee and 50% discount");
                        }

                    }

                    //Bike commute
                case 2:
                    if (commute == 2)
                    {
                        if (miles < 21)
                        {
                            System.out.println("You receive a free coffee");
                        }
                        else if (miles > 21 && miles <= 30)
                        {
                            System.out.println("You receive a free coffee and a 10% discount");
                        }

                        else if (miles >= 31 && miles < 50)
                        {
                            System.out.println("You receive a free coffee and a 20% discount");
                        }

                        else if (miles >= 50)
                        {
                            System.out.println("You receive a free coffee and 30% discount");
                        }

                    }

                    //Trick question? you said EVERYONE included car
                case 3:
                    if (commute == 3)
                    {
                        if (miles < 21)
                        {
                            System.out.println("You receive a free coffee");
                        }
                        else
                        {
                            System.out.println("Your Total is... ");
                        }
                    }
                    //Chose not to take discount or doesn't commute
                case 4:
                    System.out.println("Your Total is... ");
            }
        }           //Rest of Program


    }

}
