public class LCM
{
    public static void main(int denominator1,int denominator2)
    {
        int c=denominator1*denominator2,i=1;
        while(i<=c)
        {
            if(i%denominator1==0 && i%denominator2==0)
            {
                int LCM=i;
                System.out.print("LCM of the number is:"+LCM);
                break;
            }
            i++;
        }
    }
}