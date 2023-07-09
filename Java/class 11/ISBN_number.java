import java.util.Scanner;
public class ISBN_number
{
    public static void ISBN2013(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any ISBN of 10 digit:");
        String a=sc.nextLine();
        if(a.length()==10)
        {   
            int sum=0;
            for(int i=0;i<a.length();i++)
            {
                char ch=a.charAt(i);
                sum+=(ch*(i+1));
            }
            if(sum%11==0)
            System.out.print("It is a ISBN.");
            else
            System.out.print("It is not a ISBN.");
        }
        else
        System.out.print("Illegal ISBN.");
    }
}