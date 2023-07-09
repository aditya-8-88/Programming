import java.util.Scanner;
class Revers_no
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
                
        float a[]= new float[5];
        
        System.out.println("Enter 5 floating point number:");
        for(int i = 0; i < 5;i++)
        a[i] = sc.nextFloat();
        
        System.out.println("Number in reverse order are:");
        for(int i = 4; i >= 0;i--)
         System.out.println(a[i]);
         
        sc.close(); 
    }
}