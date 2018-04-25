import java.util.Scanner;

public class IntergalacticVendingMachines
{
    public static void main(String[] args)
    {
        String[] food = new String[3];
        food[0] = "Freeze Dried Sushi";
        food[1] = "Spock's Brain Blast";
        food[2] = "Alien Asparagus";
        printMenu(food);

        //count foods
        int[] counter = new int[3];
        counter[0] = 0;
        counter[1] = 1;
        counter[2] = 2;


        //if select # 99
        boolean chose;


    }


    public static void printMenu(String[] food )
    {
        Scanner in = new Scanner(System.in);
        //foods

        System.out.println("Please Select From: ");
        System.out.println("0) " + food[0]);
        System.out.println("1) " + food[1]);
        System.out.println("2) " + food[2]);
        System.out.println();
        int choice = in.nextInt();
        System.out.println("Your Selection was " + food[choice]);
    }

}
