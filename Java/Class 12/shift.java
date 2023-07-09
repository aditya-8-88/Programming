import java.util.Scanner;
public class shift
{
    int mat[][];
    int m,n;
    shift(int mm,int nn)
    {
        m=mm;
        n=nn;
    }
    void input()
    {
        mat=new int[m][n];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            mat[i][j]=sc.nextInt();
        }
    }
    void cyclic(shift P)
    {
        
    }    
    void display()
    {
        System.out.println("Original word: "+wrd);
        System.out.println("Swaped Word: "+swapWrd);
        System.out.println("Sorted word: "+sortWrd);
    }
    public static void main(String args[])
    {
        swapSort cs=new swapSort();
        cs.readWord();
        cs.swapChar();
        cs.sortWord();
        cs.display();
    }
}