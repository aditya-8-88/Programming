import java.util.Scanner;
public class frequency
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String st= sc.nextLine();
        int max=0,count=0,flag=0;
        char letter=' ';
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            for(int j=0;j<st.length();j++)
            {
                char ch1=st.charAt(j);
                if(ch==ch1)
                count++;                
            }
            if(count>max)
            {
                letter=ch;
                max=count;
            }
            if(count==max)
            flag=1;
            count=0;
        }
        if(flag==0)
        System.out.println("Highest Frequency Letter is: "+letter+"\n It's frequency is: "+max);
        else
        System.out.println("One of the Highest Frequency Letters is: "+letter+"\n It's frequency is: "+max);
    }
}