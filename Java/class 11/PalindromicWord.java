import java.util.Scanner;
public class PalindromicWord
{
    public static void main(String adii[])
    {
        Scanner sc = new Scanner(System.in);
        System. out. print("Enter a sentence:");
        String st=sc.nextLine(),st1="";
        int count0=0,count1=0;
        char ch=st.charAt(st.length()-1);
        if(ch=='.'||ch=='!'||ch==','||ch=='?')
        {
            for(int i=0;i<st.length();i++)
            {
                ch=st.charAt(i);
                st1+=ch;
                int k=st1.length()-2;
                if(ch=='.'||ch=='!'||ch==','||ch=='?'||ch==' ')
                {
                    for(int j=0;j<st1.length()-1;j++)
                    {
                        if(st1.charAt(j)==st1.charAt(k))
                        count0++;                        
                        k--;
                    }
                    if(count0==(st1.length()-1))
                    {
                        System.out.print(st1);
                        count1++;
                        st1="";
                        count0=0;
                    }
                    else
                    {
                        st1="";
                        count0=0;
                    }
                }
            }
        }
        else
        {
            System.out.println("Not an appropiriate sentence according to question.");
            System.exit(0);
        }
        System.out.println();
        if(count1>0)
        System.out.println("Number of palindromic words:"+count1);
        else
        System.out.println("no palindromic words");
    }
}