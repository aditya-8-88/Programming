import java.util.Scanner;
public class palin
{
    int num;
    int revnum;
    palin()
    {
        num=0;
        revnum=0;
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=sc.nextInt();
    }
    int reverse(int y)
    {
        if(y==0)
        return revnum;
        else
        {
            revnum=revnum*10+(y%10);
            y/=10;
            //revnum+=revnum*10+(y%10);
            return reverse(y);
        }
    }
    void check()
    {
        //System.out.println(reverse(num));
        //System.out.println((num));
        int d=reverse(num);
        if(d==num)
        System.out.println("Palindrome Number!");
        else
        System.out.println("Not a Palindrome Number!");
    }
    public static void main(String args[])
    {
        palin cs=new palin();
        cs.accept();
        cs.check();
    }
}