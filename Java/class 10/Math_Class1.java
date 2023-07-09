import java.io.*;
import java.util.Scanner;
public class Math_Class1
{
    static void Math_Class()//24
    {
        double x=3.99;
        double y=2.51;
        System.out.println(Math.sin(x));
        System.out.println(Math.cos(y));
        System.out.println(Math.tan(x));
        System.out.println(Math.asin(y));
        System.out.println(Math.acos(x));
        System.out.println(Math.atan(y));
        System.out.println(Math.atan2(x,y));
        System.out.println(Math.pow(x,y));
        System.out.println(Math.exp(x));
        System.out.println(Math.log(y));
        System.out.println(Math.sqrt(x));
        System.out.println(Math.ceil(y));
        System.out.println(Math.floor(x));
        System.out.println(Math.rint(y));
        System.out.println(Math.abs(x));
        System.out.println(Math.max(y,x));
        System.out.println(Math.min(y,x));
        System.out.println(Math.random()*10);//41
    }
    public static void calculator(long a, long b)//simply calculator is formed
    {
        long sum=a+b;
        System. out. println("The addition      of the numbers   = "+sum);
        long sub=a-b;
        System. out. println("The subtraction   of the numbers   = "+sub);
        long mul=a*b;
        System. out. println("The multiply      of the numbers   = "+mul);
        double div=a/b;
        System. out. println("The division      of the numbers   = "+div);
        int pie=22/7;
        long circumference=2*(pie*a);
        System. out. println("The circumference of the circle    = "+circumference);
        long peri=2*(a+b);
        System. out. println("The perimeter     of the rectangle = "+peri);
        long area=a*b;
        System. out. println("The area          of the rectangle = "+area);
    }
    public static void main(int denominator1,int denominator2)
    {
        int c=denominator1*denominator2,i=1;
        while(i<=c)
        {
            if(i%denominator1==0 && i%denominator2==0)
            {
                int LCM=i;
                System.out.print("LCM of the number is:"+LCM);
                break;
            }
            i++;
        }
    }
    public static void binarySearch(int n)// 6-Binary searching
    {
        int A[]={5,10,15,20,25,30,35,40,45,50};
        int flag=0,L=0,U=9,M=0;
        while(L<=U)
        {
            M=(L+U)/2;
            if(n>A[M])
            L=M+1;
            else if(n<A[M])
            U=M-1;
            else
            {
            flag=1;
            break;
            }
        }
        if(flag==1)
        System.out.println("Element is at:"+(M+1));
        else
        System.out.println("Element is not present");
    }
    public static void SelectionSort(int A[])// 7--Selection Sort Method
    {
        //int A[]={40,35,5,20,25,30,10,5,45,50};
        int pos,small,temp;
        for(int i=0;i<A.length;i++)
        {
             small=A[i];
             pos=i;
             for(int j=i+1;j<A.length;j++)
             {
                 if(A[j]<small)
                 {
                     small=A[j];
                     pos=j;
                 }
             }
             temp=A[i];
             A[i]=A[pos];
             A[pos]=temp;
        }
        System.out.println("Element in acending order are presented as belows:-");
        for(int i=0;i<A.length;i++)
        {
            System.out.println(A[i]);
        }
    }
    public static void main1(int n,int m)
    {
        for(int i=2;i<n;i++)
        {
            if(i%m==0)
            {
                System.out.print("Number is "+i);
                if(i%2==0)
                System.out.println(" which is even");
                else
                System.out.println(" which is odd");
            }
        }
    }
    public static void special_two_digit2014(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any two-digit number:");
        int a=sc.nextInt();
        int sum=0,multiply=1,c=a,d;
        while(c>0)
        {
            d=c%10;
            sum=sum+d;
            multiply=multiply*d;
            c=c/10;
        }
        if((sum+multiply)==a)
        System.out.print("It is a special two digit number");
        else
        System.out.print("It is not a special two digit number");
    }
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
    public static void palindrome2016(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any word:");
        String a=sc.nextLine();
        String c="";
        for(int b=(a.length()-1);b>=0;b--)
        {
            c=c+a.charAt(b);
        }
        if(c.equals(a))
        System.out.print("It is a palindrome word as well as special word");
        else if((a.charAt(a.length()-1))==(a.charAt(0)))
        System.out.print("It is only a special word");
        else
        System.out.print("It is neither a special word nor a palindrome word");
    }
    public static void prime_number2010(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any number:");
        int a=sc.nextInt();
        int b=0;
        int c;
        System.out.println("This is divisible by:");
        for(int i=1;i<=100;i++)
        {
            if(a%i==0)
            {
                b++;
                c=i;
                System.out.println(c);
            }
        }
        if(b==2)
        System.out.print("It is a prime number");
        
        else
        System.out.print("It is not a prime number");
    }
    public static void demo5(int A[])// 8--Bubble Sort Method
    {
        //int A[]={50,10,15,20,25,30,35,40,45,5};
        int small,temp;
        for(int i=0;i<A.length;i++)
        {
             for(int j=0;j< (A.length-i-1) ;j++)
             {
                 if(A[j]>A[j+1])
                 {
                     temp=A[j];
                     A[j]=A[j+1];
                     A[j+1]=temp;
                 }
             }
        }
        System.out.println("Element in acending order are presented as belows:-");
        for(int i=0;i<A.length;i++)
        {
            System.out.println(A[i]);
        }
    }
    public static void ISBN2013(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any ISBN of 10 digit:");
        String a=sc.nextLine();
        if(a.length()==10)
        {   
            int sum=0;
            for(int i=0;i<a.length();i++)
            {
                char ch=a.charAt(i);
                sum+=(ch*(i+1));
            }
            if(sum%11==0)
            System.out.print("It is a ISBN.");
            else
            System.out.print("It is not a ISBN.");
        }
        else
        System.out.print("Illegal ISBN.");
    }
    public static void fibnocci(String adii[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int a=0,b=1;
        for(int i=0;i<=n;i++)
        {
            System.out.print(a);
            int c=a+b;
            a=b;
            b=c;
        }
    }
    public static void palidrom(String adii[])
    {
        Scanner sc = new Scanner(System.in);
        System. out. print("Enter the number of times to check the palidrom numbers:");
        int z=sc.nextInt();
        for(int v=0;v<=z;v++)
        {
            System.out.print("Enter the number:");
            long n=sc.nextInt();
            long a=0;
            for(int i=0;i<=n;i++)
            {
                long b=n%10;
                a=a*10+b;
                long c=n/10;
                n=c;
            }
            System.out.println(a);
        }
    }
    public static void largesmall(int v[ ])
    {
       int i , n=5, large, small;
       large=v[0]; 
       small=v[0];
       for(i=0;i<n;i++)
       { if(v[i]>large)
         large =v[i];
         else if(v[i] > small)
         small =v[i];
       }
       System.out.println("Largest Element:"+large);
       System.out.println("Smallest Element:"+small);
    }
    public static void Fibonacci_series2012(String args[])
    {
        int a=0,b=1,sum=0;
        System.out.print("Fibonacci series "+a+" ");
        System.out.print(b+" ");
        for(int i=1;i<10;i++)
        {
            sum=a+b;
            a=b;
            b=sum;
            System.out.print(sum+" ");
        }        
    }
    public static void demo2(String args[])// 5-linear search
    {
        int marks[][]={{40,40,40},{50,50,50}, {60,60,60} , {80,80,80}};
        int total[]=new int[4];
        char grade[]=new char[4];
        float average;
        for(int i=0;i<4;i++)
        {
            total[i]=0;
            for(int j=0;j<3;j++)
            total[i]+=marks[i][j];
            average=total[i]/3;
            if(average<45)
            grade[i]='D';
            if(average>=45 && average<60)
            grade[i]='C';
            if(average>=60 && average<75)
            grade[i]='B';
            if(average>=75)
            grade[i]='A';
        }
        for(int i=0;i<4;i++)
        { 
            System.out.println("Student "+(i+1));
            System.out.print("Total marks "+total[i]);
            System.out.println("\t Grade"+grade[i]);
        }
    }
    public static void pronic2018(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any number:");
        int a=sc.nextInt();
        int b=0;
        while(b*(b+1)<a)
        {
            b++;
        }
        if(b*(b+1)==a)
        System.out.print("It is a pronic number");
        else
        System.out.print("It is not a pronic number");
    }
    //https://www.xvideos2.com/video32460101/bratty_sis_-_sister_wants_my_cock_while_mom_is_near_s2_e11
}