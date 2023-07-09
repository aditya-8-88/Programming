import java.util.Scanner; 
public class FormateOfTakingInput
{
    public static void input2015()
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the vehicle number:");
        int vno=sc.nextInt();
        System.out.print("Enter the number of hours:");
        int hours=sc.nextInt();
        System.out.print("Enter the number of hours:");//here in this case when string is typed blow int so the next line to this string will not be executed. 
        String ours=sc.nextLine();
    }
}