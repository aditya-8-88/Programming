import java.util.Scanner;
class One_D_Array
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array:");
        int a = sc.nextInt();
        int b []= new int[a];
        
        for(int i=0;i<a;i++)
        {
            System.out.println("Enter the value of an array");
            b[i] = sc.nextInt();
        }
         for(int j=0;j<a;j++)
        {
            System.out.println(b[j]);
        }
    }
}