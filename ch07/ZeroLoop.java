import java.util.Scanner;

public class ZeroLoop
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int answer;

       do
        {
            System.out.println("Please enter a number");

           answer = in.nextInt();

        }
        while (answer != 0);
        System.out.println("Great Guess!");

    }


}

