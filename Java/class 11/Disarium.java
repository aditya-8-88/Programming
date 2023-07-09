import java.io.*;
public class Disarium
{
    int num=0,size=0;
    void input() throws IOException
    {
        BufferedReader cs=new BufferedReader(new InputStreamReader(System.in));
        num=Integer.parseInt(cs.readLine());
    }
    void countDigit()
    {
        try
        {
            int n=num;
            while(n>0)
            {
                n/=10;
                size++;
            }
        }
        catch(NumberFormatException e)
        {
            System.out .println(e.getMessage()+"is not valid.");
        }
    }
    void check()
    {
        int n=num,sum=0;
        while(n>0)
        {
            int d=n%10;
            sum+=Math.pow(d,size);
            size--;
            n/=10;
        }
        if(sum==num)
        System.out .println(num+" is a disarium number.");
        else
        System.out .println(num+" is not a disarium number.");
    }
    public static void main(String args[])throws IOException
    {
        Disarium obj=new Disarium();
        obj.input();
        obj.countDigit();
        obj.check();
    }
}