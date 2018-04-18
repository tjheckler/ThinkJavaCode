
import java.util.Scanner;
    /**
     * Converts centimeters to feet and inches.
     */
    public class TempConvert
    {

        public static void main(String[] args) {
            double celsius;
            double fahrenheit;

            Scanner in = new Scanner(System.in);

            // prompt the user and get the value
            System.out.print("Exactly how many cm? ");
            celsius = in.nextDouble();

            fahrenheit = (celsius * 9.0/5.0) + 32;
            System.out.println("Temp in Farenheight is: " + fahrenheit);



        }

    }

