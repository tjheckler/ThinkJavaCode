public class Time
{
    public static void main(String[] args)
    {
        int hour = 15;
        int minute = 46;
        int second = 33;

        /*Calculate current time to seconds since midnight, 15 hours x 60 minutes x 60 seconds
        + minutes x 60 seconds + seconds = 56793
         */
        int secondsSinceMidnight = (hour * 60) * 60 + (minute * 60) + second;
        System.out.print("Number of seconds since midnight: ");
        System.out.println(secondsSinceMidnight);
        //Calculate one day into seconds
        double oneDay = 24 * 60 * 60;
        double secondsUntilMidnight =  oneDay - secondsSinceMidnight;
        System.out.println("Number of seconds until midnight: " + secondsUntilMidnight);
        //Percentage of the day that has passed
        System.out.print("Percent of day that has passed: " + secondsSinceMidnight * 100 / oneDay);
        System.out.println("%");
        //Change hour minute and second to reflect current time

        //Place holders for computation
        int x = hour;
        int y= minute;
        int z = second;
        //Change values to "current" time
        hour = 18;
        minute = 58;
        second = 45;
        //Compute how much time has passed in hours minutes and seconds
        int elapsedHour =  hour - x;
        int elapsedMinute = minute - y;
        int elapsedSecond = second -z;
        System.out.print("Elapsed Time: "+ elapsedHour);
        System.out.print(" Hours "+ elapsedMinute);
        System.out.print(" Minutes "+ elapsedSecond);
        System.out.println(" Seconds has passed since starting exercise.");

    }
}
