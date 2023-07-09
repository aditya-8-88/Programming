import java.util.Scanner;
public class PrimeAdam
{
    int m,n;
    PrimeAdam()
    {
        m=0;
        n=0;
    }
    void input()
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("m=");
        m=sc.nextInt();
        System.out.print("n=");
        n=sc.nextInt();
    }
    void calc()
    {
        if(m>n)
        System.out.println("INVALID INPUT");
        else
        {
            System.out.println("The Prime-Adam Integers are:");
            int count=0,flag=0;
            for(int i=m;i<=n;i++)
            {
                for(int j=1;j<=i;j++)
                if(i%j==0)
                count++;
                if(count==2)
                {
                    int a=i,rev=0;
                    while(a>0)
                    {
                        int d=a%10;
                        rev=rev*10+d;
                        a/=10;
                    }
                    int rev2=0;
                    int mul=rev*rev;
                    while(mul>0)
                    {
                        int d=mul%10;
                        rev2=rev2*10+d;
                        mul/=10;
                    }
                    if((i*i)==rev2)
                    {
                        System.out.print(i+"\t");
                        flag++;
                    }
                }
                count=0;
            }
            System.out.println();
            if(flag==0)
            System.out.println("NIL");
            System.out.println("Frequency of Prime-Adam is: "+flag);
        }
    }
    public static void main(String args[])
    {
        PrimeAdam cs=new PrimeAdam();
        cs.input();
        cs.calc();
    }
}           