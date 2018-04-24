import java.util.Scanner;

public class HowManyPets
{

    public static void main(String[] args)
    {
       howManyPets();

    }
    public static void howManyPets()
    {
        Scanner in = new Scanner(System.in);
         int pets;

         String[] petNames;
         String petName;

        System.out.println("How many pets do you have? ");

        pets = in.nextInt();
        in.nextLine();
       petNames = new String[pets];

       for (int i =0;  i< pets; i++)
        {
            System.out.println("What is the name(s)? ");
             petName = in.nextLine();
             petNames[i] = petName;

        }

        printArray2(petNames);

    }
    public static void printArray2(String[] values)
    {
        for (String value : values)
        {
            System.out.println("Your pets name is " + value);
        }
    }
}
