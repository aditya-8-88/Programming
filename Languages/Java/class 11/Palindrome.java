import java.util.Scanner;
public class Palindrome
{
    public static void palidrom(String adii[])
    {
        Scanner sc = new Scanner(System.in);
        System. out. print("Enter the number of times to check the palidrom numbers:");
        int z=sc.nextInt();
        for(int v=0;v<z;v++)
        {
            System.out.print("Enter the number:");
            long n=sc.nextInt();
            long a=0;
            while(n>0)
            {
                long b=n%10;
                a=a*10+b;
                n=n/10;
            }
            System.out.println(a);
        }
    }
}