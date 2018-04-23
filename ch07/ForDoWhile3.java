public class ForDoWhile3
{
    public static void main(String[] args)
    {

        forLoop(0);
        While(100,-100);
        DoWhile(-100,100);
    }
    public static void forLoop (int i)
    {


        for (i = -100; i <= 100; i+=8)
        {
            System.out.println(" Count up i = " + i);

        }
        for (i = 100; i >= -100; i-=8)
        {
            System.out.println(" Count down i = " + i);

        }
    }
    public static void While(int num, int num2)
    {

        while(num >= -100)
        {
            System.out.println("While Countdown: " + num);
            num -=8 ;
        }
        while(num2 <= 100)
        {
            System.out.println("While Countup: " + num2);
            num2 +=8 ;
        }
    }
    public static void DoWhile(int number,int number2)
    {

        do
        {
            System.out.println("DoWhile Countup: "+ number);
            number += 8;
        }
        while(number <= 100);

        do
        {
            System.out.println("DoWhile Countdown: "+ number2);
            number2 -= 8;
        }
        while(number2 >= -100);
    }
}
