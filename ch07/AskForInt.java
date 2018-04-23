import java.util.Scanner;

public class AskForInt
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int answer;
        int total = 0;


        do
        {

            System.out.println("Please enter a number");
            answer = in.nextInt();
            total = answer + total;
            System.out.println("Your total is " + total);
        }
        while (total <= 1000);

        System.out.println("Your total is " + total);

    }
}
