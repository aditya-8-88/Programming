import java.util.Scanner;
public class EqMat
{
    int a[][];
    int m,n;
    EqMat(int mm,int nn)
    {        
        m=mm;
        n=nn;
        a=new int[m][n];
    }
    void readArray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        a=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            a[i][j]=sc.nextInt();
        }
    }
    int check(EqMat P,EqMat Q)
    {
        int count=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(P.a[i][j] == Q.a[i][j])
                count++;                
            }
        }
        if(count==(m*n))
        return 1;
        else
        return 0;
    }
    void print()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            System.out.print(a[i][j]+" ");
            System.out.println();
        }
    }
    public void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns:");
        int c=sc.nextInt();
        EqMat cs1= new EqMat(r,c);
        EqMat cs2= new EqMat(r,c);
        System.out.print(" 1:");
        cs1.readArray();
        System.out.print(" 2:");
        cs2.readArray();
        System.out.println("Array 1:");
        cs1.print();
        System.out.println("Array 2:");
        cs2.print();
        int cw=check(cs1,cs2);
        if(cw==1)
        System.out.println("Yes, Equal array");
        else
        System.out.println("No, Unequal array");
    }
}