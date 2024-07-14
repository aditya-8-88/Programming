import java . util . Scanner;
public class Armstrong_no
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
            m = m+(d * d * d);
            a = a / 10;
        }
        if ( n == m )
        System.out.print("It is a Armstrong number ");
        else
        System.out.print("It is not a Armstrong number ");
    }
}