public class LogicMethods
{
    public static void main(String[] args)
    {
        printIsLarge(101);
        printIsLargeOrSmall(6);
        printLargest(10 ,10);
        printLargestOdd(5,5);
    }
    public static void printIsLarge(int number)
    {
        if (number > 99)
        {
            System.out.println("The number is large");
        }
    }
    public static void printIsLargeOrSmall(int number)
    {
        if (number > 99 )
        {
            System.out.println("The number is large");
        }
        else if (number < 10)
        {
            System.out.println("The number is small");
        }
    }
    public static void printLargest(int number1, int number2)
    {
        int value;
        if(number1 > number2)
        {
            value= number1;
            System.out.println("The largest number is: " + value);
        }
        else if (number1 < number2)
        {
            value = number2;
            System.out.println("the largest number is: "+value);

        }
        else System.out.println("The two numbers are equal");
    }
    public static void printLargestOdd(int number1, int number2)
    {
        int value;
        if ((number1 % 2 != 0) && number1 > number2)
        {

            value = number1;
            System.out.println("The larges odd number is: "+ value );
        }
        else if ((number2 % 2 != 0) && number2 > number1)
        {
            value = number2;
            System.out.println("The largest odd number is: "+ value );
        }
        else if ((number1 % 2 == 0) && (number2 % 2 ==0))
        {
            System.out.println("Neither number is odd");
        }


         if ((number1 % 2 != 0) && (number2 % 2 != 0 ))
        {
            System.out.println("Two odds make an even");

            if ((number1 % 2 != 0) && (number2 % 2 != 0 && (number1 == number2)))
            {
                int sum = number1 + number2;
                System.out.println("The Sum of the two odds are: " + sum);
            }
        }
    }

}
