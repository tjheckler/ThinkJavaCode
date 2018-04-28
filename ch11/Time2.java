public class Time2
{
    private int hour;
    private int minute;
    private boolean PM;

    public Time2(int hour, int minute)
    {
        this.hour = hour;
        this.minute = minute;
    }
    public Time2(int hour, int minute, boolean PM)
    {
        this.hour = hour;
        this.minute = minute;
        this.PM = PM;

    }


    public String getMilitaryTime()
    {
        if (hour < 10 && minute < 10)
        {
            return  "0"+getHour() + ":0" + getMinute();
        }
        else  if (hour < 10)
        {
            return "0"+getHour() + ":" + getMinute();
        }
        else if (minute < 10)
        {
            return getHour() + ":0" + getMinute();
        }
        else
        {
            return getHour() + ":" + getMinute();
        }
    }
    public String getTime()
    {
        if (hour > 12 && PM)
        {
            return "Civilian Time: "+ (getHour() - 12) + ":" + getMinute() + "  PM";
        }
        else if (hour <= 12)
        {
            return "Civilian Time: "+"0" + getHour() + ":" + getMinute() + " AM";
        }
        else if (minute < 10)
        {
            return "Civilian Time: "+getHour() + ":0" + getMinute() + " AM";
        }
        else
             return "Civilian Time: "+getHour() + ":" + getMinute() + " AM";
    }



    public int getHour()
    {
        return hour;
    }

    public int getMinute()
    {
        return minute;
    }

    public boolean PM()
    {
        return PM;
    }


}
