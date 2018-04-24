public class MultiplicationTable
{
    public static void main(String[] args)
    {

        int tableSize = 5;

        printMultiplicationTable(tableSize);

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
}
