import java.util.Scanner;
public class adder
{
    int a[];
    adder()
    {
        a=new int[2];
    }
    void readTime()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of hours:");
        a[0]=sc.nextInt();
        System.out.println("Enter number of minutes:");
        a[1]=sc.nextInt();
    }
    void addTime(adder x,adder y)
    {
        //adder cs1=new adder();
        //adder cs2=new adder();
        System.out.println("Time 1:");
        x.readTime();
        System.out.println("Time 2:");
        y.readTime();
        a[0]=x.a[0]+y.a[0];
        //System.out.println(x.a[0]);
        a[1]=x.a[1]+y.a[1];
        //System.out.println(y.a[1]);
    }
    void display()
    {
        int rem=a[1]/60;
        a[0]+=rem;
        a[1]%=60;
        System.out.println("No.of hours= "+a[0]+"\t No. of minutes= "+a[1]);
    }
    public static void main(String args[])
    {
        //int a1[]=new int[2];
        //int a2[]=new int[2];
        adder cs1=new adder();
        adder cs2=new adder();
        adder cs=new adder();
        cs.readTime();
        cs.addTime(cs1,cs2);
        cs.display();
    }
}