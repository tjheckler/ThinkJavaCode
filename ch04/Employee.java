import java.util.Random;
import java.util.Scanner;

public class Employee
{
    public static void main(String[] args)
    {
        int birthYear = 1992;

        boolean isUnionMember = false;

        String firstName = "Timothy";
        String middleName = "John";
        String lastName = "Heckler";

        int employeeNumber;
        Scanner scanner = new Scanner(System.in);
        printHeader();
        System.out.println("Please enter your 5 digit employee number:");
        employeeNumber = scanner.nextInt();

        printFullName(firstName, middleName, lastName);
        printUnionStatus(isUnionMember);
        printAge(birthYear);
        printEvenOrOdd(employeeNumber);
        printGenerateSecretPassword(employeeNumber);
    }

    public static void printHeader()
    {
        System.out.println("Welcome to WallabyTech Employee Application");
        System.out.println("===========================================");
    }

    public static void printFullName(String firstName, String middleName, String lastName)
    {
        System.out.println(lastName + ", " + firstName + " " + middleName);
    }

    public static void printUnionStatus(boolean unionStatus)
    {
        System.out.println("Your union status is: " + unionStatus);
    }

    public static void printAge(int birthYear)
    {
        int age;
        int currentYear = 2018;
        age = currentYear - birthYear;
        System.out.println("Your age is: " + age);
    }

    public static void printEvenOrOdd(int x)
    {
        int isOdd = 1;
        int isEven = 2;
        if (x % 2 == 0)
        {
            System.out.println("Employee number is even/odd (1=odd, 2=even; " + isEven);
        } else
        {
            System.out.println("Employee number is even/odd (1=odd, 2=even; " + isOdd);
        }
    }

    public static void printGenerateSecretPassword(int employeeNumber)
    {
        Random random = new Random();
        int min = 1;
        int max = 10;
        int randomNumber = random.nextInt(max - min + 1) + min;
        int superSecretPassword = (employeeNumber + randomNumber) * 5;
        System.out.println("Employee's random secret pw is: " + superSecretPassword);

    }
}
