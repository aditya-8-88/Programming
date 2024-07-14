import java .util.Scanner;
public class Palindrome2016
{
    public static void palindrome2016(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any word:");
        String a=sc.nextLine();
        String c="";
        for(int b=(a.length()-1);b>=0;b--)
        {
            c=c+a.charAt(b);
        }
        if(c.equals(a))
        System.out.print("It is a palindrome word as well as special word");
        else if((a.charAt(a.length()-1))==(a.charAt(0)))
        System.out.print("It is only a special word");
        else
        System.out.print("It is neither a special word nor a palindrome word");
    }
}