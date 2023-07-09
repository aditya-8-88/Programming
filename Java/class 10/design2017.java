import java.util.Scanner;
public class design2017
{
    String n="";
    int unit=0;
    double bill=0;
    void accept2017()
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your name please! -");
        n=sc.nextLine();
        System.out.print("Enter the unit consumed-");
        unit=sc.nextInt();
    }
    void calculate2017()
    {
        if(unit<=100)
        bill=2*unit;
        if(unit>100&&unit<=300)
        bill=3*unit;
        if(unit>300)
        bill=5*unit;
    }
    void print2017()
    {
        System.out.println("name         :"+n);
        System.out.println("unit consumed:"+unit);
        System.out.println("bill         :"+bill);
    }
    public static void main2017(String args[])
    {
        design2017 cs=new design2017();
        cs.accept2017();
        cs.calculate2017();
        cs.print2017();
    }
}                                                                       