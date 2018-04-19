import java.util.Random;
import java.util.Scanner;
/**
 * Starter code for the "Guess My Number" exercise.
 */
public class GuessStarter {

    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int number = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100: ");
        System.out.println("Can you guess what it is? ");
        int guess = in.nextInt();
        System.out.println("Your Guess is " + guess);
        System.out.println();
        System.out.println("The number I was thinking of was "+number);
        int difference = guess - number;
        System.out.println("You were off by "+ Math.abs(difference));
    }

}
