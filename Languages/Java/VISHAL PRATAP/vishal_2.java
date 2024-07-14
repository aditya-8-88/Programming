import java . util . Scanner;
public class vishal_2// palindrom_not
{
    public static void main (String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        int a = n;
        int m = 0;
        while (a > 0)
        {
            int d = a % 10;
            m = m * 10 + d;
            a = a / 10;
        }
        if ( m == n )
        System.out.print("It is a palindrom number ");
        else
        System.out.print("It is not a palindrom number ");
    }
}