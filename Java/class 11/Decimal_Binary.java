import java.util.Scanner;
public class Decimal_Binary
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        long n=sc.nextLong();
        long sum=1,c=n;
        while(c>0)
        {
            long d=c%2;
            sum=sum*10+d;
            c=c/2;
        }
        long bin=0;
        while(sum>1)
        {
            long d=sum%10;
            bin=bin*10+d;
            sum=sum/10;
        }
        System.out.println("Binary equivalent of "+n+" is "+bin);
    }
}