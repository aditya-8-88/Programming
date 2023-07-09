import java.util.Scanner;
import java.util.StringTokenizer;
public class sen3
{
    String st;
    int pos1,pos2;
    sen3()
    {
        st="";
        pos1=0;
        pos2=0;
    }
    void input()
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("");
        st=sc.nextLine();        
    }
    void check()
    {
        int count=0;
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(ch=='!'||ch=='?'||ch=='.')
            {
                count++;
                if(count==1)
                pos1=i;
                if(count==2)
                pos2=i;
            }
        }
        if(count!=2)
        {
            System.out.println("INVALID INPUT");
            System.exit(0);
        }
    }
    void calc()
    {
        String st1=st.substring(0,pos1+1);
        String st2=st.substring(pos1+1,st.length());
        System.out.println(st1+"\n"+st2);
        System.out.println("COMMAN WORDS\tFREQUENCY");
        st1=st1.substring(0,st1.length()-1);
        st2=st2.substring(0,st2.length()-1);
        StringTokenizer obj1=new StringTokenizer(st1);
        StringTokenizer obj2=new StringTokenizer(st2);
        int c1=obj1.countTokens();
        int c2=obj2.countTokens();
        String arr1[]=new String[c1];
        String arr2[]=new String[c1];
        for(int i=0;i<c1;i++)
        arr1[i]=obj1.nextToken();
        for(int j=0;j<c2;j++)
        arr2[j]=obj2.nextToken();
        //System.out.println(st1+"\n"+st2);
        String st3=st1+" "+st2;
        //System.out.println(st3);
        String arr3[]=new String[c1+c2];
        StringTokenizer obj3=new StringTokenizer(st3);
        for(int x=0;x<c1+c2;x++)
        arr3[x]=obj3.nextToken();
        int flag=0;
        for(int y=0;y<c1+c2;y++)
        {
            for(int z=0;z<c1+c2;z++)
            if(arr3[y].equals(arr3[z]))
            flag++;
            if(flag>1)
            {
                System.out.println(arr3[y]+" \t\t "+flag);
                flag=0;
                arr3[y]="";
            }
            else
            flag=0;
        }
    }
    public static void main(String args[])
    {
        sen3 cs= new sen3();
        cs.input();
        cs.check();
        cs.calc();
    }
}