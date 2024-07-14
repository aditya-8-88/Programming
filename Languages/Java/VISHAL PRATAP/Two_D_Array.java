import java.util.Scanner;
class Two_D_Array
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows & column of an array:");
        int a = sc.nextInt();
        int c = sc.nextInt();
        int b [][] = new int[a][c];
        
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<c;j++)
            {
              System.out.println("Enter the value of an array");
                b[i][j] = sc.nextInt();
            }
        }
         for(int k=0;k<a;k++)
        {
            for(int l=0;l<c;l++)
            {
              System.out.print(b[k][l]);
            }
              System.out.println();
        }
    }
}    
    
    