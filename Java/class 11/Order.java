import java.util.*;
public class Order
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a<b&&a<c)
        System.out.println("Smallest: "+a);        
        if(b<a&&b<c)
        System.out.println("Smallest: "+b);        
        if(c<a&&c<b)
        System.out.println("Smallest: "+c);
        if(a<b&&a>c||a>b&&a<c)
        System.out.println("Second Largest: "+a);        
        if(b<a&&b>c||b>a&&b<c)
        System.out.println("Second Largest: "+b);        
        if(c<a&&c>b||c>a&&c<b)
        System.out.println("Second Largest: "+c);
        if(a>b&&a>c)
        System.out.println("Largest: "+a);        
        if(b>a&&b>c)
        System.out.println("Largest: "+b);        
        if(c>a&&c>b)
        System.out.println("Largest: "+c);
    }
}