import java.util.Scanner;
public class swapSort
{
    String wrd,swapWrd,sortWrd;
    int len;
    swapSort()
    {
        wrd="";
        len=0;
        swapWrd="";
        sortWrd="";
    }
    void readWord()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word in UpperCase:");
        wrd=sc.nextLine();
        wrd.toUpperCase();
    }
    void swapChar()
    {
        len=wrd.length();
        swapWrd=wrd.charAt(len-1)+wrd.substring(1,len-1)+wrd.charAt(0);
    }
    void sortWord()
    {
        String wrd1=wrd;
        int pos=0;
        for(int i=0;i<len;i++)
        {
            char ch=wrd.charAt(i);
            for(int j=i;j<wrd1.length();j++)
            {
                char ch1=wrd1.charAt(j);
                if(ch>=ch1)
                {
                    ch=ch1;
                    pos=j;
                }
            }
            sortWrd+=ch;
            wrd1=wrd1.substring(0,pos)+wrd1.substring(pos+1,len);
        }
    }
    void display()
    {
        System.out.println("Original word: "+wrd);
        System.out.println("Swaped Word: "+swapWrd);
        System.out.println("Sorted word: "+sortWrd);
    }
    public static void main(String args[])
    {
        swapSort cs=new swapSort();
        cs.readWord();
        cs.swapChar();
        cs.sortWord();
        cs.display();
    }
}