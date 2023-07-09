import java . util . Scanner;
public class vishal_13// Spy no._not
{
    public static void main (String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        int sum = 0 , mul = 1 , c = n;
        while ( c > 0 )
        {
            int d = c % 100 ;
            sum += d ;
            mul *= d ;
            c = c / 10 ;
        }
        if ( sum == mul )
        System.out.print("It is a spy number ");
        else
        System.out.print("It is not a spy number ");
    }
}