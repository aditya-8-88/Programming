import java.util.Scanner;
public class design2015
{
    int vno=0;
    int hours=0;
    double bills=0.0;
    void input2015()
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the vehicle number:");
        vno=sc.nextInt();
        System.out.print("Enter the number of hours:");
        hours=sc.nextInt();
        System.out.print("Enter the number of hours:");
        String ours=sc.nextLine();
    }
    void calculate2015()
    {
        if(hours>0&&hours<=1)
        bills=3*hours;
        else
        bills=1.5+(hours-1)*3;
    }
    void display2015()
    {
        System.out.println("vehicle number"+vno);
        System.out.println("number of hours:"+hours);
        System.out.println("bill:"+bills);
    }
    public static void main2015(String args[])
    {
        design2015 cs=new design2015();
        cs.input2015();
        cs.calculate2015();
        cs.display2015();
    }
}