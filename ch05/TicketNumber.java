import java.util.Scanner;
public class TicketNumber
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 6 digit ticket number: ");
        int ticketNumber = in.nextInt();
        int lastDigit = ticketNumber%10;
        int prefix = ticketNumber / 10;
        int remainder = prefix % 7;
        boolean result = lastDigit == remainder;


        if(result == true)
        {
            System.out.println(ticketNumber + " Is a good number");
        }
        else
        {
            System.out.println("Bad Number, Try again");
        }


    }

}
