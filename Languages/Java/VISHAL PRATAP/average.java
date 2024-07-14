import java.util.Scanner;
class average
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int a = sc.nextInt();
        int c = sc.nextInt(); 
        int b = sc.nextInt();
        int d = sc.nextInt();
        double av = (a+b+c+d)/4;
        System.out.println("Average="+av);
    }
}
