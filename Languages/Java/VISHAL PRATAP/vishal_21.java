import java.util.Scanner;
 public class vishal_21
 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float numbers[] = new float[5];
        
        System.out.println("Enter 5 floating point numbers");
        for (int i = 1; i<5; i++)
         numbers[i] = sc.nextFloat();
            
         System.out.println("Numbers in reverse order are:");
        for (int i = 4; i >= 0; i--)
         System.out.println(numbers [i]);
         
         sc.close();
    }
 }