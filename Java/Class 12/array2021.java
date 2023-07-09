import java.util.Scanner;
public class array2021
{
    int arr[][];
    int m,n;
    array2021()
    {
        m=0;
        n=0;
        arr=new int[m][n];
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows and column respectively: ");
        int m=sc.nextInt();
        int n=sc.nextInt();
        if(m>2&&n>2&&m<8&&n<8)
        {
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    arr[i][j]=sc.nextInt();
                    System.out.print(" ");
                }
            }
        }
        else
        {
            System.out.println("OUT OF RANGE");
            System.exit(0);
        }
    }
    void calc()
    {
        
    }
    void display()
    {
        System.out.println("Original String: "+str);
        System.out.println("No. of words: "+wordcount);
        System.out.println("No. of consonants: "+cons);
    }
    public static void main(String args[])
    {
        array2021 cs=new array2021();
        cs.calc();
        cs.display();
    }
} 