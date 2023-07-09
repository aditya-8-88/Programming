import java.io.*;
import java.util.Scanner;
public class DEMO_class2
{
    public static void output( )throws IOException
    {
        double n;
        InputStreamReader ss = new InputStreamReader(System.in);
        BufferedReader sss = new BufferedReader(ss);
        System.out.println("Enter the number:");
        n=Double.parseDouble(sss.readLine());
        System.out.println("Natural Logarithem of the number:"+Math.log(n));
        System.out.println("Absolute value of the number:"+Math.abs(n));
        System.out.println("Sqare root of the number:"+Math.sqrt(n));
        System.out.println("Random number:"+Math.random( ));
    }
    public static void main0(String adii[])
    {
        double x=5.4;
        double y=2.7;
        double result=(x>y)?y:x;
        System.out.println("Minimum Number is:"+result);
    }
    public static void main5(String adii[])
    {
        double x=5.4;
        double y=2.7;
        System.out.println("x + y ="+(x+y));
        System.out.println("x - y ="+(x-y));
        System.out.println("x * y ="+(x*y));
        System.out.println("x / y ="+(x/y));
    }
    public static void areaCircle(int r)//area of circle
    {
        int pie=22/7;
        int area=pie*r*r;
        System. out. println("circumference of the circle = "+area);
    }  
    public static void increment(String adii[])//increment is done
    {
        int x=21,y; 
        y=x++;
        System. out. print(y);
    }
    
}