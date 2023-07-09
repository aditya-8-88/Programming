import java . util . Scanner;
public class Methord_overloading
{
    public static void display()
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        int x = sc.nextInt();
        
        for(int i = 1; i <= n; i++)
        {
            System.out.print(Math.pow(x,i)+ "/" + i + "+");
        }
    }
    public static void display(int a)
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number:");
        
        for(int i = 1;i <= 9; i++)
        {
            System.out.println(i + "*" + (++i) + "+");
            i-- ;
        }
    }
     public static void display(int a,int b)
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number:");
        
        for(int i = 1;i <= 9; i++)
        {
            System.out.println(i + "*" + (i+2) + "+");
        }
    }
}