public class whileloop
{
    public static void main (String[]args)
    {
        int a=4 ;
        int b=2 ;
        int c ;
        System.out.println(a);
        System.out.println(b);
        while(b<=21)
        {
            c = a+b; 
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
    

