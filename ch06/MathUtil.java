public class MathUtil
{
    public static void main(String[] args)
    {
        System.out.println(absoluteSum(12,12));
        System.out.println(absoluteSum(12,12,-12));
    }

    public static int absoluteSum(int a, int b)
    {
        int absa = Math.abs(a);
        int absb = Math.abs(b);
        int absSum = absa + absb;
        return absSum;
    }
    public static int absoluteSum(int a, int b, int c)
    {
        int absa = Math.abs(a);
        int absb = Math.abs(b);
        int absc = Math.abs(c);
        int absSum = absa + absb + absc;
        return absSum;
    }

}
