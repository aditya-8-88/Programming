import java.util.Scanner;
public class mobius
{
    int n;
    mobius()
    {
        n=0;
    }
    void input()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:");
        n=sc.nextInt();
    }
    void cal()
    {
        int arr[]=new int[10000];
        int count=0;
        if(n==1)
        System.out.println("1=1\nNO PRIME FACTORS\nM(1)=1");
        else
        {
            int a=n;
            outer:
            while(a>1)
            {
                for(int i=2;i<=n;i++)
                {
                    if(a%i==0)
                    {
                        arr[count++]=i;
                        a/=i;
                        continue outer;
                    }
                }
            }
            System.out.print(n+" = ");
            for(int i=0;i<count-1;i++)
            System.out.print(arr[i]+" * ");                
            System.out.println(arr[count-1]);
            int flag=0;
            for(int i=0;i<count;i++)
            {
                for(int j=0;j<count;j++)
                {
                    if(arr[i]==arr[j])
                    flag++;
                }
            }
            if(flag>count)
            {
                System.out.println("DUPLICATE PRIME FACTORS");
                System.out.println("M("+n+")"+" = 0");
                System.exit(0);
            }
            else
            {
                System.out.println("NUMBER OF DISTINCT PRIME FACTORS = "+count);
                if(count%2==0)
                System.out.print("M("+n+")"+" = 1");
                else
                System.out.print("M("+n+")"+" = -1");
            }
        }        
    }    
    public static void main(String args[])
    {
        mobius cs=new mobius();
        cs.input();
        cs.cal();
    }
}