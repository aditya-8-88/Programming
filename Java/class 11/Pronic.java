import java.util.Scanner;
public class Pronic
{   
    public static void pronic2018(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any number:");
        int a=sc.nextInt();
        int b=0;
        while(b*(b+1)<a)
        {
            b++;
        }
        if(b*(b+1)==a)
        System.out.print("It is a pronic number");
        else
        System.out.print("It is not a pronic number");
    }
}