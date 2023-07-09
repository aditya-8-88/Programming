import java.util.Scanner;
public class Matrix
{
    int M,N;
    Matrix()
    {
        M=0;
        N=0;
    }
    void input()
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("M=");
        M=sc.nextInt();
        System.out.print("N=");
        N=sc.nextInt();
    }
    void calc()
    {
        if(M>0&&M<10&&N>2&&N<6)
        {
            Scanner sc =new Scanner(System.in);
            int arr[][]=new int [M][N];
            String s[]=new String[M]; 
            for(int i=0;i<M;i++)
            {
                System.out.print("Enter elements of Row "+(i+1)+": ");
                s[i]=sc.nextLine();
            }
            for(int i=0;i<M;i++)
            {
                String st=s[i];
                for(int j=0;j<N;j++)
                {                    
                    arr[i][j]=Integer.parseInt(st.charAt(j)+"");
                    if(arr[i][j]>7||arr[i][j]<0)
                    {
                        System.out.println("INVALID INPUT");
                        System.exit(0);
                    }
                }
            }
            int sum=0;
            System.out.println("FILLED MATRIX\tDECIMAL EQUIVALENT");
            for(int i=0;i<M;i++)
            {
                for(int j=0,x=N-1;j<N;j++)
                {
                    System.out.print(arr[i][j]+"   ");
                    sum+=arr[i][j]*Math.pow(8,x--);
                }
                System.out.println(" \t "+sum);
                sum=0;
            }
        }
        else
        System.out.println("OUT OF RANGE");
    }
    public static void main(String args[])
    {
        Matrix cs =new Matrix();
        cs.input();
        cs.calc();
    }
}