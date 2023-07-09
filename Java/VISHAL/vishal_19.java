import java.util.Scanner;
 public class vishal_19
 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers of rows ");
        int rows =sc.nextInt();
        for (int i = 1; i<rows ; i++)
        {
             for (int j = i; j<rows; j++)
             {
                  if ( j == rows )
         System.out.println(i+"  ");
         else
         System.out.println("* ");
        }
           for (int k = i; k < i; k++)
             {
                System.out.println("* ");
            }
              System.out.println();
        }
         sc.close();
        }
    }