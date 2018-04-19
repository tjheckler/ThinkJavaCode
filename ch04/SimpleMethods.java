public class SimpleMethods
{
    public static void main (String[] args)
    {
        printCount(5);
        printSum(4,6);
        printSum(7,2);
        printBoolean(true);
        printBoolean(false);
    }
    private static void printCount(int count)
    {
        System.out.println("The count is: " + count);
    }

   private static void printSum(int x, int y)
    {
        int sum= x+y;
        System.out.println(x + "+" + y);
        System.out.println(x+"+"+y+"="+sum);
    }
   private static void printBoolean(Boolean isStudent)
    {
        System.out.println("I am a student: "+ isStudent);
    }
}
