import java.util.Scanner;
public class design2016
{
    private String book_name;
    private double price_of_the_book;
    void design2016()
    {
        book_name="";
        price_of_the_book=0.0; 
    }
     void input2016()
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the name of book:");
        book_name=sc.nextLine();
        System.out.print("Enter the price_of_the_book:");
        price_of_the_book=sc.nextDouble();
    }
    void calculate2016()
    {
        if(price_of_the_book<=1000)
        price_of_the_book=price_of_the_book-(2*price_of_the_book/100);
        if(price_of_the_book>1000&&price_of_the_book<=3000)
        price_of_the_book=price_of_the_book-(10*price_of_the_book/100);
        if(price_of_the_book>3000)
        price_of_the_book=price_of_the_book-(15*price_of_the_book/100);
    }
    void display2016()
    {
        System.out.println("name of the book:"+book_name);
        System.out.println("price_of_the_book of the book after discount:"+price_of_the_book);
    }
    public static void main2016(String args[])
    {
        design2016 cs=new design2016();
        cs.input2016();
        cs.calculate2016();
        cs.display2016();
    }
}