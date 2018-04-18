public class Withdrawal
{
    public static void main (String[] args)
    {
        //Compute $137 withdrawal into appropriate bills
        int withdrawal = 137;
        int twenty = 20;
        int ten = 10;
        int five = 5;
        int one = 1;
        int distributeTwenties = withdrawal / twenty;
        int twentyRemainder = withdrawal % twenty;
        int distributeTen = twentyRemainder / ten;
        int tenRemainder = twentyRemainder % ten;
        int distributeFive = tenRemainder / five;
        int fiveRemainder = tenRemainder % five;
        int distributeOne = fiveRemainder / one;
        System.out.println("When withdrawal = 137");
        System.out.print("Distribute $20 bills = " + distributeTwenties);
        System.out.print(", $10 bills = " + distributeTen);
        System.out.print(", $5 bills = " + distributeFive);
        System.out.println(", $1 bills = " + distributeOne);
        System.out.println("\n");

        //Compute $100 withdrawal into appropriate bills
        withdrawal = 100;
         distributeTwenties = withdrawal / twenty;
         twentyRemainder = withdrawal % twenty;
         distributeTen = twentyRemainder / ten;
         tenRemainder = twentyRemainder % ten;
         distributeFive = tenRemainder / five;
         fiveRemainder = tenRemainder % five;
         distributeOne = fiveRemainder / one;
        System.out.println("When withdrawal = $100");
        System.out.print("Distribute $20 bills = " + distributeTwenties);
        System.out.print(", $10 bills = " + distributeTen);
        System.out.print(", $5 bills = " + distributeFive);
        System.out.println(", $1 bills = " + distributeOne);
        System.out.println("\n");

        //Compute $20 withdrawal into appropriate bills
        withdrawal = 20;
        distributeTwenties = withdrawal / twenty;
        twentyRemainder = withdrawal % twenty;
        distributeTen = twentyRemainder / ten;
        tenRemainder = twentyRemainder % ten;
        distributeFive = tenRemainder / five;
        fiveRemainder = tenRemainder % five;
        distributeOne = fiveRemainder / one;
        System.out.println("When withdrawal = $20");
        System.out.print("Distribute $20 bills = " + distributeTwenties);
        System.out.print(", $10 bills = " + distributeTen);
        System.out.print(", $5 bills = " + distributeFive);
        System.out.println(", $1 bills = " + distributeOne);
        System.out.println("\n");

        //Compute $17 withdrawal into appropriate bills
        withdrawal = 17;
        distributeTwenties = withdrawal / twenty;
        twentyRemainder = withdrawal % twenty;
        distributeTen = twentyRemainder / ten;
        tenRemainder = twentyRemainder % ten;
        distributeFive = tenRemainder / five;
        fiveRemainder = tenRemainder % five;
        distributeOne = fiveRemainder / one;
        System.out.println("When withdrawal = $17");
        System.out.print("Distribute $20 bills = " + distributeTwenties);
        System.out.print(", $10 bills = " + distributeTen);
        System.out.print(", $5 bills = " + distributeFive);
        System.out.println(", $1 bills = " + distributeOne);
        System.out.println("\n");

        //Compute $15 withdrawal into appropriate bills
        withdrawal = 15;
        distributeTwenties = withdrawal / twenty;
        twentyRemainder = withdrawal % twenty;
        distributeTen = twentyRemainder / ten;
        tenRemainder = twentyRemainder % ten;
        distributeFive = tenRemainder / five;
        fiveRemainder = tenRemainder % five;
        distributeOne = fiveRemainder / one;
        System.out.println("When withdrawal = $15");
        System.out.print("Distribute $20 bills = " + distributeTwenties);
        System.out.print(", $10 bills = " + distributeTen);
        System.out.print(", $5 bills = " + distributeFive);
        System.out.println(", $1 bills = " + distributeOne);
        System.out.println("\n");

        //Compute $2 withdrawal into appropriate bills
        withdrawal = 2;
        distributeTwenties = withdrawal / twenty;
        twentyRemainder = withdrawal % twenty;
        distributeTen = twentyRemainder / ten;
        tenRemainder = twentyRemainder % ten;
        distributeFive = tenRemainder / five;
        fiveRemainder = tenRemainder % five;
        distributeOne = fiveRemainder / one;
        System.out.println("When withdrawal = $2");
        System.out.print("Distribute $20 bills = " + distributeTwenties);
        System.out.print(", $10 bills = " + distributeTen);
        System.out.print(", $5 bills = " + distributeFive);
        System.out.println(", $1 bills = " + distributeOne);

        //This was tough for the 2nd day, may be crude but it meets requirements!
    }
}
