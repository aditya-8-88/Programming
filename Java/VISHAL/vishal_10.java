import java . util. Scanner; 
public class vishal_10
{
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
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a integer");
        n =sc.nextInt();
        if(n>100)
        System.out.println("n is greater than 100");
        else if(n<100)
        System.out.println("n is smaller than 100");
        else
        System.out.println("n is equal than 100");
    }
}
        