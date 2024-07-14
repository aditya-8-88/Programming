import java.util.Scanner;
public class TheString
{
    String str;
    int len,wordcount,cons;
    TheString()
    {
        len=0;
        wordcount=0;
        cons=0;
    }
    TheString(String ds)
    {
        str=ds;
    }
    void countFreq()
    {
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch==' ')
            wordcount++;
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {}
            else
            cons++;
        }
        wordcount+=1;
    }
    void display()
    {
        System.out.println("Original String: "+str);
        System.out.println("No. of words: "+wordcount);
        System.out.println("No. of consonants: "+cons);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String ds=sc.nextLine();
        TheString cs=new TheString(ds);
        cs.countFreq();
        cs.display();
    }
} 