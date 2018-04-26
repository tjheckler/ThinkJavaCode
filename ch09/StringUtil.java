public class StringUtil
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to StringUtil");
        System.out.println();
        getFirstCharacter("Goodbye");
        getFirstCharacter("Hello");
        System.out.println();
        getLastCharacter("Hello");
        getLastCharacter("Goodbye");
        System.out.println();
        System.out.println(getFirstTwoCharacters("Hello"));
        System.out.println(getFirstTwoCharacters("Goodbye"));

        System.out.println();
        System.out.println(getLastTwoCharacters("Goodbye"));
        System.out.println(getLastTwoCharacters("Hello"));
        System.out.println();
        System.out.println(getFirstThreeCharacters("Hello"));
        System.out.println(getFirstThreeCharacters("Goodbye"));
        System.out.println();
        System.out.println(printCharacters("Hello"));
        System.out.println(printCharacters("Goodbye"));
        System.out.println();
        printPhoneNumber("501-555-0100");
        System.out.println();
        findFirstE("Hello");
        findFirstE("Goodbye");
        System.out.println();
        System.out.println();
        System.out.println(isFinn("Finn"));
        System.out.println(isFinn("Jake"));


    }

    private static String getFirstCharacter(String value)
    {
        String word = "Hello";
        String newWord = "Goodbye";
        System.out.println(word.substring(0, 1));
        System.out.println(newWord.substring(0, 1));
        return value.substring(0, 1);
    }

    private static String getLastCharacter(String value)
    {
        int startIndex = value.length() - 1;
        return value.substring(startIndex, startIndex + 1);
    }

    private static String getFirstTwoCharacters(String value)
    {
        return value.substring(0, 2);


    }

    private static String getLastTwoCharacters(String value)
    {
        int startIndex = value.length() - 2;
        return value.substring(startIndex, startIndex + 2);
    }

    private static String getFirstThreeCharacters(String value)
    {
        return value.substring(0, 3);
    }

    private static String printCharacters(String value)
    {
        for (int i = 0; i < value.length(); i++)
        {
            char letter = value.charAt(i);
            System.out.println(letter + ":" + i);
        }
        return value;
    }

    private static void printPhoneNumber(String value)
    {
        String phoneNumber = "501-555-0100";

        System.out.print("Area Code: " + phoneNumber.substring(0, 3) + " ");
        System.out.print("Exchange: " + phoneNumber.substring(4, 7) + " ");
        System.out.println("Line Number: " + phoneNumber.substring(8, 12));
    }

    private static void findFirstE(String e)
    {
        String e1 = "Hello";
        String e2 = "Goodbye";
        int index = e1.indexOf("e");
        int index2 = e2.indexOf("e");
        System.out.println("First e in " + e1 + " is at position: " + index);
        System.out.println("First e in " + e2 + " is at position: " + index2);
    }

    private static boolean isFinn(String value)
    {

        if (value.equals("Finn"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}

