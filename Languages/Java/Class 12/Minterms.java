import java.util.Scanner;
public class Minterms
{
    String st;
    String stElements[];
    char Variable[]; 
    String answer[];
    int m,an,ansCount;
    Minterms()
    {
        m=0;
        an=0;
        st="";
        ansCount=0;
        answer=new String[1000];
    }

    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter the boolean expression:");
        st=sc.nextLine();
    }

    void countVariables()
    {
        int c=65,count=0;
        char arr1[]=new char[26];
        int arr2[]=new int[26];
        for(int i=0;i<26;i++)
        {
            arr1[i]=(char)c++;
            for(int j=0;j<st.length();j++)
            {
                if(arr1[i]==st.charAt(j))
                    count++;
            }
            arr2[i]=count;
            count=0;
        }
        for(int i=0;i<arr2.length;i++)
            if(arr2[i]!=0)
                m++;
        Variable=new char[m];       
        int c1=0;
        for(int i=0;i<arr2.length;i++)
            if(arr2[i]!=0)
            {
                Variable[c1++]=arr1[i];
                //System.out.println(m);
            }
    }

    void makingArray()
    {
        stElements=new String[m];
        String st1=st+"+";
        int c1=0;
        for(int i=0;i<st1.length();i++)
        {
            if(st1.charAt(i)=='+')
            {
                stElements[c1++]=st1.substring(i);
                st1=st1.substring(i+1,st1.length());
            }
        }
    }    

    void calc()
    {
        int flag=0,f=0;
        String st3="";
        String st1="";
        String st2=st+"+";
        for(int i=0;i<st2.length();i++)
        {
            char ch=st2.charAt(i);
            if(ch=='+')
            {
                outer:
                for(int j=0;j<Variable.length;j++)
                {                    
                    for(int z=0;z<st1.length();z++)
                    {
                        if(Variable[j]==st1.charAt(z) && st1.charAt(z)!='*')
                            flag=1;
                        //if(f==1 && st3.charAt(z)!='*' && Variable[j]==st3.charAt(z))
                        //flag++;
                    }
                    if(flag==0)
                    {
                        f++;
                        //if(f==1)
                        //{
                        st1=st1+Variable[j];
                        st3=st1+Variable[j]+"*";
                        //st1=answer[an-2];
                        //st3=answer[an-1];
                        //ansCount+=2;
                        continue outer;
                        //}                   
                        //answer[an-2]=st3+Variable[j];
                        //answer[an-1]=st3+Variable[j]+"*";

                    }
                    else 
                        flag=0;
                    if(f==2)
                    {
                        answer[an-2]=st1+Variable[j];
                        answer[an-1]=st3+Variable[j];
                        answer[an++]=st1+Variable[j]+"*";
                        answer[an++]=st3+Variable[j]+"*";
                        ansCount+=2;

                    }
                    f=0;
                    /*if(flag>1)
                    {
                    an=an-2;

                    f=1;

                    continue outer;
                    }*/
                }
                st1="";
            }
            else
                st1+=ch;
        }
    }

    void display()
    {
        for(int i=0;i<ansCount-1;i++)
            System.out.print(answer[i]+"+");
        System.out.print(answer[ansCount-1]);
    }

    public static void main(String args[])
    {
        Minterms cs=new Minterms();
        cs.input();
        cs.countVariables();
        cs.makingArray();
        cs.calc();
        cs.display();
    }
}
