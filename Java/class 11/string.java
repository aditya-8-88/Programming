import java.util.Scanner;
public class string
{   
    public static void main(String args[])
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
}