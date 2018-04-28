public class Time2Tester
{
    public static void main(String[]args)
    {

        Time2 currentTime;
        currentTime = new Time2 (9,45,true);
        System.out.println(currentTime.getTime());
        System.out.println();

        System.out.println("Military Time: "+currentTime.getMilitaryTime());
        System.out.println();


        currentTime = new Time2 (14,30,true);

        System.out.println("Military Time: "+currentTime.getMilitaryTime());
        System.out.println();
        System.out.println(currentTime.getTime());

    }

}
