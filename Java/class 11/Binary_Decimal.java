import java.util.Scanner;
public class Binary_Decimal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        long n=sc.nextLong();
        long sum=0,c=n,i=0;
        while(c>0)
        {
            long s=c%10;
            sum=sum+(long)(s*(Math.pow(2,i)));
            c=c/10;i++;
        }
        System.out.println("Decimal equivalent of "+n+" is "+sum);
    }
}