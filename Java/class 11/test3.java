public class test3
{
    public static void main(String args[])
    {
        int m,n,p,q=0;
        for(m=2;m<=3;m++)
        {
            for(n=1;n<=m;n++)
            {
                p=m+n-1;
                if(p%3==0)
                q+=p;
                else
                q+=p+4;
            }
        }
        System.out.println(q);
    }
}