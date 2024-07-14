import java.util.Scanner;
public class overload
{
    public static double volume(double R)
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the radius:");
        R=sc.nextDouble();
        double V=(4/3)*(22/7)*R*R*R;
        return V;
    }
    public static double volume(double R,double H)
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the radius:");
        R=sc.nextDouble();
        System.out.print("Enter the height:");
        H=sc.nextDouble();
        double V=(22/7)*R*R*H;
        return V;
    }
    public static double volume(double L,double H,double B)
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the length:");
        L=sc.nextDouble();
        System.out.print("Enter the height:");
        H=sc.nextDouble();
        System.out.print("Enter the breadth:");
        B=sc.nextDouble();
        double V=L*B*H;
        return V;
    }
}