import java.util.Scanner;
 public class vishal_24
 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers of rows ");
        int numrows =sc.nextInt();
        for (int i = 1; i<numrows ; i++)
        {
             for (int j = i; j<numrows; j++)
             {
                  if ( j == numrows )
         System.out.print(i+"  ");
         else
         System.out.print("* ");
        }
           for (int k = 1; k < i; k++)
             {
                System.out.print("* ");
            }
              System.out.println();
        }
         sc.close();
        }
    }