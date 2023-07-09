import java.util.Scanner;
public class Chapter6
{
    public static void Question12(String adii[])
    {        
        Scanner sc = new Scanner(System.in);
        System. out. print("Enter the value of n and x:");
        int n=sc.nextInt();
        int x=sc.nextInt();
        int S=0;
        for(int i=0;i<=n;i++)
        S+=Math.pow(x,i);
        System.out.println(S);
    }
    public static void Question11(String adii[])
    {        
        Scanner sc = new Scanner(System.in);
        System. out. print("Enter the value of n and x:");
        double n=sc.nextDouble();
        double x=sc.nextDouble();
        double S=0,fact=1;
        for(int i=1;i<=n;i++)
        {
            fact*=i;
            if(i%2!=0)
            S+=(Math.pow(x,i))/fact;
            else
            S-=(Math.pow(x,i))/fact;
        }
        System.out.println(S);
    }
    public static void Question10(String adii[])
    {        
        Scanner sc = new Scanner(System.in);
        System. out. print("Enter the value of n:");
        double n=sc.nextDouble();
        //double x=sc.nextDouble();
        double S=0,fact=1;
        for(int i=1;i<=n;i++)
        {
            fact*=i;
            S+=(Math.pow(1,i))/fact;
        }
        System.out.println(S);
    }
    public static void Question09(String adii[])
    {        
        Scanner sc = new Scanner(System.in);
        System. out. print("Enter a number to get it's reverse:");
        int n=sc.nextInt();
        int S=0,d;
        while(n>0)
        {
            d=n%10;
            S=10*S+d;
            n/=10;
        }
        System.out.println(S);
    }
    public static void Question08(String adii[])
    {        
        Scanner sc= new Scanner(System.in);
        System. out. print("Enter upto where you want the tribonacci series:");
        int n=sc.nextInt();
        System.out.print("0 1 2 ");
        int S=0,d,a=0,b=1,c=2;
        while(n>0)
        {
            S=a+b+c;
            System.out.print(S+" ");
            a=b;
            b=c;
            c=S;
            if(c>n)
            break;
        }        
    }
    public static void Question07(String adii[])
    {        
        Scanner sc = new Scanner(System.in);
        System. out. print("Enter the value of n and m:");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int S=0;
        for(int i=2;i<n;i++)
        if(i%m==0 && i%2==0)
        System.out.println(i+" is divisible by "+m+",where "+i+" is even number");
        else if(i%m==0 && i%2!=0)
        System.out.println(i+" is divisible by "+m+",where "+i+" is odd number");
    }
    public static void Question06(String adii[])
    {        
        Scanner sc = new Scanner(System.in);
        System. out. print("Enter the values of both the denominators:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int c=n1*n2;
        for(int i=1;i<=c;i++)
        if(i%n1==0 && i%n2==0)
        {   
            System.out.println("LCM is:"+i);
            break;
        }
    }
    public static void Question04t6(String adii[])
    {        
        Scanner sc = new Scanner(System.in);
        System. out. print("Enter the values:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        System.out.println("Largest Element is:"+Math.max(Math.max(n1,n2),n3));
        
        System.out.println("Smallest Element is:"+Math.min(Math.min(n1,n2),n3));
    }
}