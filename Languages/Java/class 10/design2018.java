import java.util.Scanner;
public class design2018
{
    String name="";
    String coach="";
    long mobno=0;
    int amt=0;
    int totalamt=0;
    void accept2018()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("FILL THE FOLLOWING DETAILS");
        System.out.print("Enter your name please! -");
        name=sc.nextLine();
        System.out.print("Sir your coach please(First_AC/Second_AC/Third_AC/sleeper)-");
        coach=sc.nextLine();
        System.out.print("Your phone number sir!  -");
        mobno=sc.nextLong();
        System.out.print("Enter the basic amount of the ticket-");
        amt=sc.nextInt();
    }
    void update2018()
    {
        if(coach.equals("First_AC"))
        totalamt=amt+700;
        else if(coach.equals("Second_AC"))
        totalamt=amt+500;
        else if(coach.equals("Third_AC"))
        totalamt=amt+250;
        else 
        totalamt=amt;
    }
    void display2018()
    {
        System.out.println("Passanger's name: "+name);
        System.out.println("Passanger's coach: "+coach);
        System.out.println("Passanger's mobile number: "+mobno);
        System.out.println("Passanger's total amount: "+totalamt);
    }
    public static void main2018(String args[])
    {
        design2018 a=new design2018();
        a.accept2018();
        a.update2018();
        a.display2018();
    }
}