import java.io.*;
import java.util.Scanner;
public class DEMO_class1
{
    public static void scholarship(String adii[])//scholarship is calculated
    {
        int sch_pm=1000;
        int yearly_sch=sch_pm*12;
        int total_sch=yearly_sch*5;
        System. out. println("Total scholarship earned in last five years is Rs."+total_sch);
    }
    public static void substraction(int a,int b)//simple substraction is done
    {
        int c=a-b;
        System. out. println(c);
    }
    public static void print1(String adii[])//simply statment is printed
    {
        System. out. println("Hello World!!");
    }
    public static void print0(String adii[])//simply statment is printed
    {
        System. out. println("Printed from inside of MyClassRoom");
        System. out. println("Thankyou");
    }
    public static void divide(String adii[])//simply division is done here
    {
        int a=17, b=3;
        int f=a/b;
        int remainder=a % b;
        System. out. println("For 17/3");
        System. out. println("quotient "+f);
        System. out. println("Remainder "+remainder);
    }
     public static void printing(String adii[])//simply two numbers are printed
    {
        int a=1, b=11;
        {
            System. out. println(+a);
            System. out. println(+b);
        }
    }
    public static void circleCircumference(int r)//circumference of circle is calculated simply
    {
        int pie=22/7;
        int circumference=2*(pie*r);
        System. out. println("circumference of the circle = "+circumference);
    }
    public static void perimetre(String adii[])//perimetre is calculated
    {
        int l =651;
        int b =416;
        int peri=2*(l+b);
        System. out. println("The perimeter of a rectangle = "+peri);
    }
    public static void main(int n)
    {
        float sum = 1/n;
        //int i=1;
        /*while(i<n)
        {
            double d=1/i;
            sum=sum+d;
            i++;
            */
           System.out.println("sum of the series="+sum);
    }
    public static void main (int a,int b)
    {
        int c= a+b;
        System.out.print(c);
    }
    public static void print3(String adii[])//string operations are done here
    {
        char ch='A';
        int res1=Character.toLowerCase(ch);
        char res=Character.toLowerCase(ch);
        System.out.println(res1);
        System.out.println(res);
    }
    public static void increment_decrement(String adii[])//simple increment and decrement operations are done here
    {
        int a=26; 
        System. out. print(a--);
        System. out. print(++a);
    }
    public static void main(String adii[])//string operations are done here
    {
        String name="Aditya Pratap Singh";
        int age=15;
        System. out. println("My name is "+name);
        System. out. println("My age is "+age);
    }
    public static void main (int a,int v,int s)
    {
        int r=a+v+s;
        System.out.print("the add of three number is :"+r);
    }
    public static void prints2(String adii[])//simply printing things
    {
        int a,b,c,d,e,sum, ave;
        Scanner s = new Scanner(System.in);
        System. out. print("Enter Four integers:" );
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        d = s.nextInt();
        e = s.nextInt();
        sum = a+b+c+d+e;
        ave = sum/5;
        System. out. println("You entered five numbers "+a+" , "+b+" , "+c+" , "+d+" and "+e);
        System. out. println("Their Average is "+ave);
    }
    public static void average(String adii[])//Simply operators are doing operations
    {
        int a1=5,a2=10,a3=15;
        a1 += 10;
        a2 += 10;
        a3 += 10;
        System. out. println("first three multiples of 5 with the addition of 10 are: "+a1+", "+a2+" and "+a3);
        int b1=6,b2=12,b3=18;
        b1 -= 5;
        b2 -= 5;
        b3 -= 5;
        System. out. println("first three multiples of six with the substraction of 5 are: "+b1+", "+b2+" and "+b3);
    }
     public static void calculate2(String adii[])//calculating values
    {
        float side, perimeter=20;
        side= perimeter/4;
        System. out. println("The sides of square with perimeter 20m, is "+side+"m");
    }
    public static void sequencial_Structure(String adii[])//example of simple sequencial structure
    {
        System. out. println("  ****        ************  ");
        System. out. println("  **   **         **        ");
        System. out. println("  **    **        **        ");
        System. out. println("  **    **        **        ");
        System. out. println("  **    **         **       ");
        System. out. println("  **    **     **   **      ");
        System. out. println("  **    **    **    **      ");
        System. out. println("  **   **      **   **      ");
        System. out. println("  ****           ****       ");
    }
    public static void main1(int a,int v)
    {
       // int a=50;
        //int v=50;
        int r=a%v;
        System.out.print("the remainder of two number is :"+r);
    }
    public static void incomeTax(String adii[])//simply tax is calculated in this program 
    {
        double income=1200000;
        double taxable= income - 300000;
        double tax= taxable*0.15;
        System. out. println("For income of Rs."+income+" tax payable is Rs."+tax);
    }
    public static void if_else(int a)//only the use of if else
    {
        if(a<3)
            {System. out. println("Hello World!!");
        }
        else    
            System. out. println("Hi! BlueJ is vey easy to work with.");
    }
    public static void main2(int a,int v)
    {
        //int a=50;
        //int v=50;
        int r=a-v;
        System.out.print("the sub of two number is :"+r);
    }
    public static void main3(int a,int v,int s)
    {
        int r=a*v*s;
        System.out.print("the multiply of three numbers is :"+r);
    }
    public static void finals(String adii[])//final keyword is used here
    {
        final double y = 3.56;
        final double m = 1760.89;
        final double a = y*m; 
        System. out. println("Answer is:"+a);
    }
    public static void sum(String adii[])//sum is done
    {
        int num1=656465, num2=46515, num3=345465, sum=num1+num2+num3;
        System. out. println("3 given numbers are:");
        System. out. println(num1);
        System. out. println(num2);
        System. out. println(num3);
        System. out. println("Sum ="+sum);
    }
    public static void main4(int a,int v)
    {
        int r=a/v;
        System.out.print("the divide of two number is :"+r);
    }
    public static void payment(String adii[])//payment is checked
    {
        int Pages_read= 54654+4454+65555;
        int amount= Pages_read*60;
        System. out. println("For "+Pages_read+" pages, amount payable is Rs."+amount);
    }  
    public static void contribution(String adii[])//contribution is caculated
    {
        int contri1=5165;
        int contri2=3356;
        int total_contri= contri1*12+ contri2*8;
        System. out. println("Total contribution is Rs."+total_contri);
    }
    public static void print4(String adii[])//string operations are done here
    {
        String st1="Smartphone", st2="Graphic Art";
        System.out.println(st1.substring(2,5));
        System.out.println(st2.substring(8).equalsIgnoreCase(st1.substring(2,5)));
    }   
}
