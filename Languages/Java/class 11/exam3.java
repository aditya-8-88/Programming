public class exam3
{
    public static void main(String args[])
    {
        int count=0;
        resume:
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                ++count;
                if(i==2&&j==2)
                break resume;
            }
        }
        System.out.println("\t count= "+count);
    }
}