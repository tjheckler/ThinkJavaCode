 class SwitchExample
{
    public static void main(String[] args)
    {
        lastNameWinner("Lazenby");
    }

    public static void lastNameWinner(String lastName)
    {
        switch (lastName )
        {
            case "smith":
                System.out.println("Congratulations, grand winner");break;
            case "jones":
                System.out.println("Congratulations, grand winner");break;

            case "Lazenby":
                 System.out.println("Hey, he owes me dinner");break;
            default:
                     System.out.println("Sorry, not a winner");


        }
    }
}


