import java.util.Scanner;
public class arm
{
    int no;
    int sum;
    arm(int n)
    {
        no=n;
        sum=0;
    }    
    void fnPerform()
    {
        int c=no,count=0;
        while(c>0)
        {
            c/=10;
            count++;
        }
        fnPower(no,count);
        System.out.println(sum);
        if(sum==no)
        System.out.println("Armstrong Number!");
        else
        System.out.println("Not an Armstrong Number!");        
    }
    long fnPower(int a , int b)
    {
        int d=a%10;
        if(a==0)
        return sum;
        else
        {
            a=a/10;
            sum+=(int)Math.pow(d,b);
            return sum + fnPower(a,b);
        }
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        arm cs=new arm(num);
        cs.fnPerform();
    }
}