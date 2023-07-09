import java.util.Scanner;
 public class vishal_17//Finding the value of Array
 {
    public static void main(String args[])
    {
        int a[], i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers of rows ");
        int rows =sc.nextInt();
         System.out.println("Enter numbers of columns ");
        int columns =sc.nextInt();
        int array2D[][] = new int[rows][ columns];
        
        System.out.println ("Enter" + (rows * columns)+ "numbers");
        for (i = 0; i<rows ; i++)
        {
             for (j = 0; j<columns; j++)
             {
             array2D[i][j] = sc.nextInt();
        }
    }
        System.out.println("Two dimensional array is:");
           for (i = 0; i<rows ; i++)
        {
             for (j = 0; j<columns; j++)
             {
            System .out. print(array2D[i][j]+"");
            }
             System.out.println();
        }
        sc.close();
    }
 }