import java.util.Scanner;

public class CrazyEdsWholesaleStringCheese
{

    public static void main(String[] args)
    {
        int size;
        int amount;
        Scanner in = new Scanner(System.in);

        System.out.println("Crazy Ed's Wholesale String Cheese offers");
        System.out.println("1 in, 2 in or 3 in, diameter string cheese");
        System.out.println("Limit: one size per order");
        System.out.println("What size cheese would you like to order? ");

        size = in.nextInt();
        if (size > 3)
        {
            System.out.println("Your order is too crazy, Please try a different size!");
        }
        else
        {
            System.out.println("How many yards would you like to order?");
            amount = in.nextInt();
            System.out.println("You ordered: " + amount + " yards of " + size + " inch thick string cheese.");


            switch (size)
            {
                case 1:
                    int price1 = 2;
                    int shipping1 = 2;
                    int withoutShipping = amount * price1;
                    int withShipping = (amount * price1) + shipping1;
                    if (amount > 50)
                    {
                        System.out.println("Your total cost will be $ " + withoutShipping);
                    } else
                    {
                        System.out.println("Your total cost will be $ " + withShipping);
                    }

                case 2:
                    int price2 = 4;
                    int shipping2 = 2;
                    withoutShipping = amount * price2;
                    withShipping = (amount * price2) + shipping2;
                    if (amount > 50)
                    {
                        System.out.println("Your total cost will be $ " + withoutShipping);
                    } else
                    {
                        System.out.println("Your total cost will be $ " + withShipping);
                    }

                case 3:
                    int price3 = 6;
                    int shipping3 = 4;
                    withoutShipping = amount * price3;
                    withShipping = (amount * price3) + shipping3;
                    if (amount > 50)
                    {
                        System.out.println("Your total cost will be $ " + withoutShipping);
                    } else
                    {
                        System.out.println("Your total cost will be $ " + withShipping);
                    }
            }
        }
    }
}



