import java.util.Scanner;
class Anshul_5// Fibonacci
{
    static void main()
    {
        int a = 0,b = 1,c;
        System.out.println("1");
    
        for (int i = 1; i < 10; i++)
         {  
         System.out.println(( a+b ) + " 1 ");
         c = b ;
         b = a + b ;
         a = c ;
         }
    }
}

