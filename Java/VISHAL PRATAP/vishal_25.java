import java.util.Scanner;
 public class vishal_25
 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the numbers of rows: ");
        int rows =sc.nextInt();
        int mynum = 1;
        
        for (int i = 1; i <= rows ; i++)
        {
             for (int j = 1; j <= i; j++)
             {
                System.out.print(mynum +" ");
                mynum++;
             }
             System.out.println();
        }       
    }
 }