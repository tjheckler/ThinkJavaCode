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
                    if ((amount >= 50) && (size == 1))
                    {
                        String header ="\n\tITEMIZED INVOICE:\n" ;
                        header += "\n\tSize\tCost\tAmount\tTotal\n";
                        header += "\n\t----\t----\t------\t-----\n";
                        String invoice = "\n\t|"+size+"in |\t| $"+price1+" | \t| "+amount+" |\t| $"+withoutShipping+" |\n";
                        System.out.println(header + invoice);
                        //System.out.println("Your total cost will be $ " + withoutShipping);
                    }
                    else if ((amount < 50)&& (size == 1))
                    {
                        String header ="\n\tITEMIZED INVOICE:\n" ;
                        header += "\n\tSize\tCost\tAmount\tshipping\tTotal\n";
                        header += "\n\t----\t----\t------\t--------\t-----\n";
                        String invoice = "\n\t|"+size+"in |\t| $"+price1+" | \t| "+amount+" |\t| $ "+shipping1+" |\t\t| $"+withShipping+" |\n";
                        System.out.println(header + invoice);
                        //System.out.println("Your total cost will be $ " + withShipping);
                    }

                case 2:
                    int price2 = 4;
                    int shipping2 = 2;
                    withoutShipping = amount * price2;
                    withShipping = (amount * price2) + shipping2;

                    if ((amount >= 75)&&(size ==2))
                    {
                        String header2 ="\n\tITEMIZED INVOICE:\n" ;
                        header2 += "\n\t Size\t Cost\t Amount\t Total\n";
                        header2 += "\n\t ----\t ----\t ------\t -----\n";
                        String invoice2 = "\n\t| "+size+"in|\t| $"+price2+" | \t| "+amount+" |\t| $"+withoutShipping+" |\n";
                        System.out.println(header2 + invoice2);
                        //System.out.println("Your total cost will be $ " + withoutShipping);
                    }
                    else if ((amount < 75)&&(size == 2))
                    {
                        String header2 ="\n\tITEMIZED INVOICE:\n" ;
                        header2 += "\n\t Size\tCost\tAmount\tShipping\tTotal\n";
                        header2 += "\n\t----\t ----\t------\t--------\t-----\n";
                        String invoice2 = "\n\t|"+size+"in |\t| $"+price2+" | \t| "+amount+" |\t| $ "+shipping2+"|\t\t| $"+withShipping+" |\n";
                        System.out.println(header2 + invoice2);
                        //System.out.println("Your total cost will be $ " + withShipping);
                    }

                case 3:
                    int price3 = 6;
                    int shipping3 = 4;
                    withoutShipping = amount * price3;
                    withShipping = (amount * price3) + shipping3;

                    if ((amount >= 25)&&(size ==3))
                    {
                        String header3 ="\n\tITEMIZED INVOICE:\n" ;
                        header3 += "\n\tSize\t Cost\tAmount\tTotal\n";
                        header3 += "\n\t----\t ----\t------\t-----\n";
                        String invoice3 = "\n\t| "+size+"in |\t| $"+price3+" | \t| "+amount+" |\t| $"+withoutShipping+" |\n";
                        System.out.println(header3 + invoice3);
                        //System.out.println("Your total cost will be $ " + withoutShipping);
                    }
                    else if ((amount < 25)&&(size ==3))
                    {
                        String header3 ="\n\tITEMIZED INVOICE:\n" ;
                        header3 += "\n\tSize\tCost\tAmount\tShipping\tTotal\n";
                        header3 += "\n\t----\t----\t------\t--------\t-----\n";
                        String invoice3 = "\n\t| "+size+"in |\t| $"+price3+" | \t| "+amount+" |\t | $ "+shipping3+" |\t\t| $ "+withShipping+" |\n";
                        System.out.println(header3 + invoice3);
                        //System.out.println("Your total cost will be $ " + withShipping);
                    }
            }
        }
    }
}



