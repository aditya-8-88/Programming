import java.util.Scanner;
public class Spy_number
{
    public static void spy2017(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any number:");
        int a=sc.nextInt();
        int sum=0,multiply=1,c=a,d;
        while(c>0)
        {
            d=c%10;
            sum=sum+d;
            multiply=multiply*d;
            c=c/10;
        }
        if(sum==multiply)
        System.out.print("It is a spy number");
        else
        System.out.print("It is not a spy number");
    }
}