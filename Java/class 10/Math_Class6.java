import java.util.Scanner;
public class Math_Class6
{
    public static void prime_number2010(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any number:");
        int a=sc.nextInt();
        int b=0,c;
        System.out.println("This is divisible by:");
        for(int i=1;i<=100;i++)
        {   
            if(a%i==0)
            {   
                b++;
                c=i;
                System.out.println(c);      
            }        
        }
        if(b==2)
        System.out.print("It is a prime number");        
        else
        System.out.print("It is not a prime number");
    }   
}
