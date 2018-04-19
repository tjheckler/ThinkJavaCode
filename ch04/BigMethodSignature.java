public class BigMethodSignature
{
    public static void main (String[] args)
    {
        printSum(1,2,3,4,5,6,7,8,9,11);
        printSum(11,22,33,44,55,66,77,88,99,111);
    }
    public static void printSum(int a, int b, int c, int d, int e, int f, int g, int h, int i,int j)
    {
       int k = a + b + c + d + e + f + g + h + i + j;
        System.out.println("The sum is: " + k);
    }
}
