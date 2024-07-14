import java . util . Scanner;
public class Palindrom_not
{
    public static void main (String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        int a = 0;
        int c = n;
        while (c > 0)
        {
            int d = c % 10;
            a = a * 10 + d;
            c = c % 10;
        }
        if ( a == n )
        System.out.print("It is a Plindrom number ");
        else
        System.out.print("It is not a Plindrom number ");
    }
}