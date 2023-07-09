import java.util.Scanner;
public class disarium
{
    int num;
    int size;
    disarium(int nn)
    {
        num=nn;
        size=0;
    }
    void count()
    {
        int d=num,count=0;
        while(d>0)
        {
            d/=10;
            count++;
        }
        size=count;
    }
    int sumOfDigits(int n,int p)
    {
        if(n==0)
        return 0;
        else
        {
            int d=n%10;
            int sum=(int)Math.pow(d,p--);
            n/=10;
            return sum+sumOfDigits(n,p);
        }
    }
    void check()
    {
        if(num==sumOfDigits(num,size))
        System.out.println("Disarium Number");
        else
        System.out.println("Not a Disarium Number");
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:");
        int nn=sc.nextInt();
        disarium cs=new disarium(nn);
        cs.count();
        cs.check();
    }
}