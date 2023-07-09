import java.util.Scanner;
public class Perfect
{
    int num;
    int a;
    Perfect(int nn)
    {
        num=nn;
        a=1;
    }
    int sum_of_factors(int i)
    {
        int sum=0;
        if(i==a)
        return sum;
        else
        if(i%a==0)
        return a++ + sum_of_factors(i);
        a++;
        return 0;
    }
    void check()
    {
        if(num==sum_of_factors(num))
        System.out.print("Yes a perfect number");
        else
        System.out.print("No, not a perfect number");
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        Perfect cs= new Perfect(n);
        cs.check();
    }
}