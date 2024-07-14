import java.util.Scanner;
public class WordSeries1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String st= sc.nextLine();
        String text="aeiou";
        int i=0,j=0,z=0,count=0;
        for(i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(ch=='a'||ch=='o'||ch=='e'||ch=='i'||ch=='u')
            {
                System.out.print(ch);
                break;
            }
            else
            System.out.print(ch);
        }        
        for(j=i+1;j<st.length();j++)
        {
            char ch=st.charAt(j);
            if(ch=='a'||ch=='o'||ch=='e'||ch=='i'||ch=='u')
            {
                System.out.print(ch);
                count=1;
            }
            else if(ch!='a'||ch!='o'||ch!='e'||ch!='i'||ch!='u')
            {
                if(count==0)
                {
                    System.out.print(text.charAt(z));
                    z++;
                }
                else
                {
                    z=1;
                    count=0;
                    System.out.print("a");
                }
            }
        }
    }
}