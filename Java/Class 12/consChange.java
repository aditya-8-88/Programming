import java.util.Scanner;
public class consChange
{
    String word;
    int len;
    consChange()
    {
        word="";
        len=0;        
    }
    void readWord()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a word in lowercase: ");
        word=sc.nextLine();        
    }
    void shiftCons()
    {
        len=word.length();
        String st1="",st2="";
        for(int i=0;i<len;i++)
        {
            char ch=word.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            st1+=ch;
            else 
            st2+=ch;
        }
        System.out.println("Shifted Consonants: "+st2+st1);
    }
    void changeWord()
    {
        String st1="",st2="";
        for(int i=0;i<len;i++)
        {
            char ch=word.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            st1+=ch;
            else 
            st2+=ch;
        }
        System.out.println("Changed word: "+st2.toUpperCase()+st1);
    }
    void show()
    {
        System.out.println("Original word: "+word);
    }
    public static void main(String args[])
    {
        consChange cs=new consChange();
        cs.readWord();
        cs.show();
        cs.shiftCons();
        cs.changeWord();
    }
}