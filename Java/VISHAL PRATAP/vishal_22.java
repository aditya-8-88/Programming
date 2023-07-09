import java.util.Scanner;
 public class vishal_22
 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n =sc.nextInt();
        for (int i = 1; i <= n ; i++)
        {
             for (int j = 1; j <= n; j++)
             {
                  if ( i == j )
                  {
                   System.out.print("\\");
                   continue;
                  }
                  if(i+j == n+1)
                  {
                  System.out.print("/");
                   continue;
                  }
                  System.out.print(". ");
               }
              System.out.println();
        }
         sc.close(); 
    }
 }