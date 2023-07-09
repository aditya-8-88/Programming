public class exam
{
    public static void main(String args[])
    {
        int x =0;
        do
        {
            if(x<3)
            {
                x+=2;
                System.out.println(x);
                continue;
            }
            else
            {
                System.out.println(++x);
                break;
            }
                    
        }while(x<10); 
    }
}