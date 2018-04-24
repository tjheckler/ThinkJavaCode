public class ArrayDemo
{
    public static void main(String[] args)
    {
        int[] value = {1, 5, 9};
        int[] moreValue = {5, 2, 9, 8, 0};
        int[] maxValues = {5, 8, 21, 19};
        double[] averageValues = {34.2, 18.0,12.5,13.1};
        int[] array = new int[10];
        array[0]=4;
        array[3]=2;
        array[9]=4;
        String[] array2 = new String[10];
        array2[0]="Hi";
        array2[3]="Hello";
        array2[9]="Bye";


        printArray(value);
        printArray(moreValue);
        int mySum = arrayTotal(moreValue);
        System.out.println("Sum of the array is " + mySum);
        int myMaxIndex = arrayMaxIndex(maxValues);
        System.out.println("Max index of the array is " + myMaxIndex);
        int myMaxNum = arrayMax(maxValues);
        System.out.println("Max number of the array is " + myMaxNum);
        double myAverage = arrayAverage(averageValues);
        System.out.println("Average value of the array is " + myAverage);
        printArray(array);
        printArray2(array2);

    }

    //print array values
    public static void printArray(int[] values)
    {
        for (int value : values)
        {
            System.out.println(value);
        }
    }

    public static int arrayTotal(int[] values)
    {
        int sum = 0;
        for (int value : values)
        {
            sum = sum + value;

        }
        return sum;
    }

    public static int arrayMax(int[] values)
    {
        int highest = 0;
        for (int value : values)
        {
            if (value > highest)
            {
                highest = value;
            }

        }
        return highest;
    }

    public static int arrayMaxIndex(int[] values)
    {
        int highest = 0;
        for (int i = 0; i <= values.length; i++)
        {
            if (highest < i)
            {
                highest = i;
            }
        }
        return highest;
    }

    public static double arrayAverage(double[] values)
    {
        double length = values.length;
        double average;
        double sum = 0;

           for(double value : values)
            {

                sum += value;

            }
            average = (sum / length);

        return average;
    }

    public static void printArray2(String[] values)
    {
        for (String value : values)
        {
            System.out.println(value);
        }
    }
}