import java.util.Scanner;
public class array
{   
    public static void pronic2018(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the values:");
        //int m=sc.nextInt();
        //int n=sc.nextInt();
        int arr[][]=new int[3][3];
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
            arr[i][j]=sc.nextInt();
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                if(i==j)
                arr[i][j]*=arr[i][j];
         outer:
        for(int i=0;i<3;i++)
            for(int j=2;j<i;j++)
            {
                arr[i][j]*=arr[i][j];
                continue outer;
            }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }
}  

