import java.util.Scanner;
public class piece
{
    String pal;
    piece()
    {
        pal="";
    }
    void fnInput()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Sentence:");
        pal=sc.nextLine();
    }
    String convert()
    {
        String st="";
        for(int i=0;i<pal.length();i++)
        {
            char ch=pal.charAt(i);
            int j=(int)ch;
            if(j<=90 && j>=65)
            st+=j;
            else if(j>=97 && j<=122)
            st+="#";
            else 
            st+="_";
        }
        return st;
    }
    int fnCountCap()
    {
        int count=0;
        for(int i=0;i<pal.length();i++)
        {
            char ch=pal.charAt(i);
            int j=(int)ch;
            if(j<=90 && j>=65)
            count++;
        }
        return count;
    }
    void fnShow()
    {
        System.out.println("Your Sentence: "+pal);
        System.out.println("New Sentence: "+convert());
        System.out.println("Number of UpperCase letters: "+fnCountCap());
    }
    public static void main(String args[])
    {
        piece cs=new piece();
        cs.fnInput();
        cs.fnShow();
    }
} 