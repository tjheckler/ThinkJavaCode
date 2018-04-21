public class isDivisible
{

    public static void main(String[] args)
    {


        System.out.println(isDivisible(4, 2));

    }

    public static boolean isDivisible(int n, int m)
    {
        if (n % m == 0)
        {
            return true;
        } else
        {
            return false;
        }
    }
}
