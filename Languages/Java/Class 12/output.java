public class output
{
    public static void fnPrint(int n)
    {
        int k=1,j;
        for(j=1;j<=n && k<=n;)
        {
            System.out.print(j+" ");
            if(j==n)
            {
                System.out.println("@");
                System.out.println("@");
                j=1;k++;
            }
            else
            j++;
        }
    }
}