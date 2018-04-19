import java.util.Scanner;
/**
 * Converts centimeters to feet and inches.
 */
public class TimeConverter
{

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        // prompt the user and get the value

        int seconds;
        int minutes ;
        int hours;
        System.out.print("Enter the number of seconds : ");
        seconds = in.nextInt();
        hours = seconds / 3600;
        minutes = (seconds % 3600) / 60;
        int secondsRemainder = (seconds % 3600) % 60;

        System.out.println(seconds + " Seconds = " + hours + " Hours " + minutes + " Minutes and " + secondsRemainder + " Seconds");


       /* int distributeTwenties = withdrawal / twenty;
        int twentyRemainder = withdrawal % twenty;
        int distributeTen = twentyRemainder / ten;
        int tenRemainder = twentyRemainder % ten;
        int distributeFive = tenRemainder / five;
        int fiveRemainder = tenRemainder % five;
        int distributeOne = fiveRemainder / one;*/
    }

}
