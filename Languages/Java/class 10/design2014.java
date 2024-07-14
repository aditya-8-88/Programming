import java.util.Scanner;
public class design2014
{
    private int year;
    private String title;
    private float rating;
    design2014()
    {
        year=0;
        title="";
        rating=0;
    }
    void accept2014()
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the title:");
        title=sc.nextLine();
        System.out.print("Enter the year:");
        year=sc.nextInt();        
        System.out.print("Enter the ratings:");
        rating=sc.nextFloat();
    }
    void display2014()
    {
        System.out.println("Title of the movie:"+title);
        if(rating<0)
        System.out.print("Wrong input");
        if(rating>=0&&rating<=2)
        System.out.print("Flop");
        if(rating>=2.1&&rating<=3.4)
        System.out.print("Semi-hit");
        if(rating>=3.5&&rating<=4.5)
        System.out.print("Hit");
        if(rating>=4.6&&rating<=5)
        System.out.print("Super Hit");
        if(rating>5)
        System.out.print("Wrong input");
    }
    public static void main2014(String args[])
    {
        design2014 cs=new design2014();
        cs.accept2014();
        cs.display2014();
    }
}