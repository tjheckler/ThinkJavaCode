import java.util.Scanner;

public class IntergalacticVendingMachines
{


    public static void main(String[] args)
    {
        run();
    }
    private static void run ()
    {
        Scanner in = new Scanner(System.in);
        int choice;
        //Populate Food Array
        Food driedSushi = new Food(" Freeze Dried Sushi", 0);
        Food brainBlast = new Food(" Spock's Brain Blast", 1);
        Food alienAsparagus = new Food(" Alien Asparagus", 2);

        Food[] meal = new Food[3];
        meal[0] = driedSushi;
        meal[1] = brainBlast;
        meal[2] = alienAsparagus;


        //Counter Array
        int[] counter = new int[3];
        counter[0] = 0;
        counter[1] = 0;
        counter[2] = 0;
        do
        {
            //Print Food Menu Start of program
            System.out.println("Please Select an Item:");
            printMenu(meal);
            System.out.println();
            choice = in.nextInt();
            System.out.println();
            int selection = choice;
            /*------------------------------------------------------------------*/


            if (choice <= (meal.length - 1) && choice >= 0)
            {
                System.out.println("Thank you for choosing: " + meal[selection].getName());
                System.out.println();
                counter[choice]++;
                System.out.println("Items sold so far:");
                printSales(counter,meal);
                System.out.println();

            } else
            {
                //do nothing
            }

        }

        while (choice !=  99);
        {

            System.out.println();
            System.out.println("Final Total Sales");
            printSales(counter, meal);
            System.out.println();
            System.out.println("GoodBye!");
        }
    }
    public static void printMenu(Food[] meals)
    {
        //Prints Menu for selection
        for (Food meal : meals)
        {
            System.out.println(meal.getId() + ") " + meal.getName());

        }
    }

    public static void printSales(int[] counter, Food[] meal)
    {
        for (int i = 0; i <= counter.length-1; i++ )
        {


                System.out.println(counter[i] + " " + meal[i].getName());


        }
    }


}
