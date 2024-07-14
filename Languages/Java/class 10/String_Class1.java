import java.io.*;
import java.util.Scanner;
public class String_Class1
{
    static void StRingClass()//5
    {
        String ch1="itya";
        String ch="aeitya";
        char ch2='A';        
        System.out.println(ch.substring(1,5));
        
        System.out.println(ch1.concat(" ").concat(ch));
        System.out.println(ch.trim());
        
        System.out.println(ch.length());
        System.out.println(Character.isUpperCase(ch2));
        System.out.println(ch.charAt(1));
        System.out.println(ch1.compareTo(ch));
        System.out.println(ch.compareTo(ch1));
        
        System.out.println(ch+ch1);
        System.out.println(ch.endsWith(ch1));
        System.out.println(ch.equals(ch1));
        System.out.println(ch.equalsIgnoreCase(ch1));
        System.out.println("Brava".indexOf('a',3));
        System.out.println("Broao".lastIndexOf('a'));
        
        System.out.println(ch.replace('e','o'));
        System.out.println(ch.startsWith(ch1));
        System.out.println(ch.toLowerCase());
        System.out.println(ch.toUpperCase());
        
        System.out.println(ch.toString());
        
        System.out.println(ch.valueOf(13));
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String st=sc.nextLine();
        int count=0;
        st.toUpperCase();
        String st1="";
        String st2="";
        for(char ch='A';ch<='Z';ch++)
        {            
            for(int i=0;i<st.length();i++)
            {
                char ch1=st.charAt(i);
                if(ch==ch1)
                {
                    st1+=ch+"\t";
                    count++;
                }
                else
                {}
            }
            st2+=count+"\t";
            System.out.println(ch+"\t"+count);
            count=0;
        }
    }
    public static void main1(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String st=sc.nextLine();
        st+=" ";
        System.out.print("First three words are:  ");
        String st1="";
        String st2="";
        char ch2;
        int count=0;
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(ch == ' ')
            count++;
            if(count<3)
            System.out.print(ch);
        }
        System.out.println();
        System.out.println("Number of words are:  "+count);
        int a=count-4;
        count=0;
        System.out.print("Last three words are: ");
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(ch==' ')
            count++;
            if(count>a)
            System.out.print(ch);
        }
        System.out.println();
        st1=st.toLowerCase();
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            char ch1=st1.charAt(i);
            if(ch1==ch)
            {
                ch2=Character.toUpperCase(ch);
                st2+=ch2;
            }
            else if(ch==' ')
            st2+=" ";
            else
            st2+=ch1;
        }
        System.out.println("New string is:       "+st2);
    }
    public static void main2(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String st=sc.nextLine();
        int max=0;
        String st1="";
        st+=" ";
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            st1+=ch;
            if(ch==' ')
            {
                if(st1.length()>max)
                max=st1.length()-1;
                st1="";
            }
        }
        System.out.println("Maximum number of words in the highest frequency word is:"+max);
    }
    public static void main3(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String st=sc.nextLine();
        char ch;
        int count=0;
        st=st.toUpperCase();
        String st1="";
        String newest="";
        for(int i=0;i<st.length();i++)
        {
            ch=st.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                count=i;
                break;
            }
            else
            newest+=ch;
        }
        st1=st.substring(count,st.length());
        System.out.println("Piglatin word is:"+st1+newest+"AY");
    }
    public static void main4(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String st=sc.nextLine();
        String st1="",newest="";
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(ch == ' ')
            {}
            else
            st1+=ch;
        }
        st1=st1.toLowerCase();        
        for(int i=0;i<st1.length();i++)
        {
            char ch=st1.charAt(i);
            if(i%2==0)
            {
                newest+=ch;
                newest+=ch;
                if(i%3==0)
                {}
                else
                newest+=ch;
            }
            else
            newest+=ch;
        }
        System.out.println(newest);
    }
    public static void main5(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String st=sc.nextLine();
        st=" "+st;
        String st1="";
        st=st.toLowerCase();
        for(int i=0;i<st.length();i++)
        {
            char ch1=st.charAt(i);
            if(ch1==(' '))
            {
                char ch=Character.toUpperCase(st.charAt(++i));
                st1+=" "+ch;
            }
            else
            st1+=ch1;
        }
        System.out.print(st1.trim());
    }
    public static void print3(String adii[])//string operations are done here
    {
        String st1="great", st2="mind";
        System.out.println(st1.substring(0,2).concat(st2.substring(1)));
        System.out.println("WH"+(st1.substring(2).toUpperCase()));
    }
    public static void main6(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String st=sc.nextLine();
        String st1="",newest="",st2="";
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(ch != ' ')
            st1+=ch;
            else
            st1+="  ";
        }
        st1=st1.toLowerCase();
        for(int i=0;i<st1.length();i++)
        {
            char ch=st1.charAt(i);
            if(i%2==0)
            {
                ch=Character.toUpperCase(st1.charAt(i));
                newest+=ch;
            }
            else
            newest+=ch;
        }
        //System.out.println(newest);
        for(int i=0;i<newest.length();i++)
        {
            char ch=newest.charAt(i);
            if(ch == ' ')
            st2+=" ";
            else
            st2+=ch+" ";
        }
        System.out.println(st2);
    }
    
}