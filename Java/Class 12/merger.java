import java.util.Scanner;
public class merger
{
    int n1;
    int n2;
    long mergNum;
    merger()
    {
        n1=0;
        n2=0;
        mergNum=0;
    }
    void readNum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("First number:");
        n1=sc.nextInt();
        System.out.println("Second number:");
        n2=sc.nextInt();
    }
    void joinNum()
    {
        int count=0,c=n2;
        while(c>0)
        {
            c/=10;
            count++;
        }
        int x=1;
        for(int i=0;i<count;i++)
        x*=10;
        mergNum=n1*x+n2;
    }
    void show()
    {
        System.out.println("First Number: "+n1);
        System.out.println("Second Number: "+n2);
        System.out.println("Merged Number: "+mergNum);
    }
    public static void main(String args[])
    {
        merger cs=new merger();
        cs.readNum();
        cs.joinNum();
        cs.show();
    }
}