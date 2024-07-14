import java.util.Scanner;
public class Letter_Count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String st=sc.nextLine();
        st=" "+st.toUpperCase();
        int count=0;
        for(int i=0;i<st.length()-1;i++)
        if(st.charAt(i)==' '&&st.charAt(i+1)=='A')
        count++;
        System.out.println("Total number of words starting with \'A\'="+count);
    }
}