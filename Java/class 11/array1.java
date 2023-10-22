import java.util.*;
public class array1
{
    int m,arr[][];
    array1(int mm)
    {
        m=mm;
        arr=new int[m][m];
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements of array:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            arr[i][j]=sc.nextInt();
        }
    }
    void calculate()
    {
        int l=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            if(arr[i][j]>l)
            l=arr[i][j];
            System.out.println("Highest number of the row "+(i+1)+" is:"+l);
            l=0;
        }
    }
    void display()
    {
        System.out.println("Where array was:-");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            System.out.print(arr[i][j]+"  ");
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter range of the array:");
        int mm=sc.nextInt();
        array1 cs=new array1(mm);
        cs.input();
        cs.calculate();
        cs.display();
    }
}