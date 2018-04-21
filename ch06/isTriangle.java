public class isTriangle
{
    public static void main(String[]args)
    {
        System.out.println(isTriangle(5,10,5));
    }

    //Can Create Triangle?
    public static boolean isTriangle(int left, int right, int bottom)
    {
        boolean noTriangle = false;
        boolean yesTriangle = true;
        // If any of the sides is > than the sum of the other two = no triangle
        if( (bottom > left + right) || ( right > bottom + left ) ||  (left > bottom + right) )
        {
            return noTriangle;
        }
        else
        {
        return yesTriangle;
        }

    }
}
