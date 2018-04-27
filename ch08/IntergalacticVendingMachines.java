import java.util.Scanner;

public class IntergalacticVendingMachines
{
    public static void main(String[] args)
    {
        Food driedSushi = new Food(" Freeze Dried Sushi",0);
        Food brainBlast = new Food(" Spock's Brain Blast",1);
       Food alienAsparagus = new Food(" Alien Asparagus",2);

        Food[] meal = new Food[3];
        meal[0] = driedSushi;
        meal[1] = brainBlast;
        meal[2] = alienAsparagus;

        printMenu(meal);
        //count foods
        //  int[] counter = new int[3];
        // counter[0] = 0;
        // counter[1] = 1;
        // counter[2] = 2;


        //if select # 99


    }


    public static void printMenu(Food[] meals)
    {
        int choice;
        Scanner in = new Scanner(System.in);
        //foods
        System.out.println("Please Select an Item:" );

        //Prints Menu for selection
for (Food meal: meals)
{
    System.out.println(meal.getId() +" "+meal.getName());
}
        System.out.println();
        choice = in.nextInt();
        System.out.println();
        int selection = choice;
        System.out.println("Your selection is: "+meals[selection].getName());


    }
}
