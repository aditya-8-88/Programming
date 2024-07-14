import java.util.Scanner;
import java.util.StringTokenizer;
public class sen2
{
    String st;
    sen2()
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
            int v=(int)st.charAt(0);
            if(v>96)
            {
                char c=(char)(v-32);
                System.out.println(c+st.substring(1,st.length()));
            }
            else
            System.out.println(st);
            st=st.substring(0,st.length()-1);
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
                    /*if((arr[j].length()==arr[j+1].length()) && (arr[j].compareTo(arr[j+1])<0))
                    {
                        word=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=word;
                    }*/
                }
            }
            int v0=(int)arr[0].charAt(0);
            if(v>96)
            {
                char c0=(char)(v0-32);
                System.out.print(c0+arr[0].substring(1,arr[0].length())+" ");
            }
            else
            System.out.print(arr[0]+" ");
            //if(l>1)
            for(int i=1;i<l-1;i++)
            System.out.print(arr[i]+" ");
            System.out.print(arr[l-1]+".");
        }
        else
        System.out.println("INVALID SENTENCE");
    }
    public static void main(String args[])
    {
        sen2 cs= new sen2();
        cs.input();
        cs.calc();
    }
}