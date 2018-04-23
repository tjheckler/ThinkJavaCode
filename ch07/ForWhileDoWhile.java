public class ForWhileDoWhile
{
    public static void main(String[] args)
    {

        forLoop(0);
        While(10);
        DoWhile(0,10);
    }
    public static void forLoop (int i)
    {


        for (i = 1; i <= 10; i++)
        {
            System.out.println(" Count up i = " + i);

        }
        for (i = 10; i >= 1; i--)
        {
            System.out.println(" Count down = " + i);

        }
    }
    public static void While(int num)
    {

        while(num >=1)
        {
            System.out.println("While Countdown: " + num);
            num -=1 ;
        }
        while(num < 10)
        {
            System.out.println("While Countup: " + num);
            num +=1 ;
        }
    }
    public static void DoWhile(int number,int number2)
    {

        do
        {
            System.out.println("DoWhile Countup: "+ number);
            number += 1;
        }
        while(number <= 10);

        do
        {
            System.out.println("DoWhile Countdown: "+ number2);
            number2 -= 1;
        }
        while(number2 >= 1);
    }
}
