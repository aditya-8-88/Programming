import java . util . Scanner;
public class vishal_8
{
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
}