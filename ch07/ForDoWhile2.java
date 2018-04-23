public class ForDoWhile2
{
    public static void main(String[] args)
    {

        forLoop(0);
        While(10);
        DoWhile(0,100);
    }
    public static void forLoop (int i)
    {


        for (i = 10; i <= 100; i++)
        {
            System.out.println(" Count up i = " + i);

        }
        for (i = 100; i >= 10; i--)
        {
            System.out.println(" Count down = " + i);

        }
    }
    public static void While(int num)
    {

        while(num >=100)
        {
            System.out.println("While Countdown: " + num);
            num -=10 ;
        }
        while(num <= 100)
        {
            System.out.println("While Countup: " + num);
            num +=10 ;
        }
    }
    public static void DoWhile(int number,int number2)
    {

        do
        {
            System.out.println("DoWhile Countup: "+ number);
            number += 10;
        }
        while(number <= 100);

        do
        {
            System.out.println("DoWhile Countdown: "+ number2);
            number2 -= 10;
        }
        while(number2 >= 10);
    }
}

