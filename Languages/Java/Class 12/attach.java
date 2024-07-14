import java.util.Scanner;
public class attach
{
    int n1,n2;
    attach()
    {
        n1=0;
        n2=0;
    }
    void getNum()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a integer of 3 digit:");
        n1=sc.nextInt();
        int c=0,d=n1;
        while(d>0)
        {
            d/=10;
            c++;
        }
        if(c!=3)
        {
            System.out.println("Please enter only a 3 digit number:");
            n1=sc.nextInt();
        }
    }
    int addDigit(int num)
    {
        int n=0,d,e=num;
        while(e>0)
        {
            d=e%10;
            n+=d;
            e/=10;            
        }
        return n;
    }
    void makeNum()
    {
        if(addDigit(n1)<10)
        n2=(n1*10)+addDigit(n1);
        else
        n2=(n1*100)+addDigit(n1);
        System.out.println("New number = "+n2);
    }
    public static void main(String args[])
    {
        attach cs=new attach();
        cs.getNum();
        cs.makeNum();
    }
}