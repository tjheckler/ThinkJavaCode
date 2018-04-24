public class MultiplicationTable
{
    public static void main(String[] args)
    {

        int tableSize = 5;

        printMultiplicationTable(tableSize);
        System.out.println();
        printMultiplicationTable2(tableSize);
    }


    public static void printMultiplicationTable(int tableSize)
    {

        for (int i = 1; i <= tableSize; i++)
        {

            for (int j = 1; j <= tableSize; j++)
            {

                System.out.printf("%4d\t", i * j);

            }

            System.out.println();

        }


    }
    public static void printMultiplicationTable2(int tableSize)
    {
        int i = 1;

       while ( i <= tableSize  )
        {
            int j = 1;
            while ( j <= tableSize )
            {

                System.out.printf("%4d\t", i * j);
                j= j + 1;
            }
            i= i + 1;
            System.out.println();

        }


    }
}
