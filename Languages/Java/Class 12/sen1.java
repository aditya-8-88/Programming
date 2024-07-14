import java.util.Scanner;
import java.util.StringTokenizer;
public class sen1
{
    String st;
    sen1()
    {
        st="";
    }
    void input()
    {
        Scanner sc =new Scanner(System.in);
        st=sc.nextLine();        
    }
    void calc()
    {
        char ch=st.charAt(st.length()-1);
        String word="";
        if(ch=='.'||ch=='?'||ch=='!')
        {
            System.out.println(st);
            st=st.substring(0,st.length()-1);
            //System.out.println(st);
            StringTokenizer s=new StringTokenizer(st);
            int l=s.countTokens();
            String arr[]=new String[l];
            for(int i=0;i<l;i++)
            arr[i]=s.nextToken();
            for(int i=0;i<l-1;i++)
            {
                for(int j=0;j<l-1;j++)
                {
                    if(arr[j].length()>arr[j+1].length())
                    {
                        word=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=word;
                    }
                    if((arr[j].length()==arr[j+1].length()) && (arr[j].compareTo(arr[j+1])>0))
                    {
                        word=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=word;
                    }
                }
            }
            for(int i=0;i<l;i++)
            System.out.print(arr[i]+" ");             
        }
        else
        System.out.println("INVALID SENTENCE");
    }
    public static void main(String args[])
    {
        sen1 cs= new sen1();
        cs.input();
        cs.calc();
    }
}