public class Even_Odd
{
    public static void main1(int n,int m)
    {
        for(int i=2;i<n;i++)
        {
            if(i%m==0)
            {
                System.out.print("Number is "+i);
                if(i%2==0)
                System.out.println(" which is even");
                else
                System.out.println(" which is odd");
            }
            else
            System.out.println("input is some where no according to program.");
        }
    }
}