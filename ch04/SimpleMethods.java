public class SimpleMethods
{
    public void main (String[] args)
    {
        printCount(5);
        printSum(4,6);
        printSum(7,2);
    }
    public static void printCount(int count)
    {
        System.out.println("The count is: " + count);
    }

    public static void printSum(int x, int y)
    {
        System.out.println(x+y);
    }
}
