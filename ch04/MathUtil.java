public class MathUtil
{
    public static void main(String[] args)
    {

        printDifference(6,7);
        printAbs(-1);

    }

    public static void printDifference(int a, int b)
    {
        int subtract = a-b;
        System.out.print("The value is " +subtract);
    }

    public static void printAbs(int a)
    {
         a = Math.abs(a);
        System.out.println(" and abs value is " + a);

    }
}
