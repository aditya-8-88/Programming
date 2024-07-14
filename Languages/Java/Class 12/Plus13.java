public class Plus13
{       public static void main(String st)
    {   String st1=st.toLowerCase();
        for(int i=0;i<st.length();i++)
        {   char ch=st.charAt(i);
            char ch1=st1.charAt(i);
            if(ch1==' ')
                System.out.print(" ");
            else
            {           if(ch==ch1)
                {         if((int)ch<110)
                        System.out.print((char)(((int)ch1)+13));
                    else
                        System.out.print((char)(((int)ch1)-13));        }
                else
                {         if((int)ch<78)
                        System.out.print((char)(((int)ch)+13));
                    else
                        System.out.print((char)(((int)ch)-13));            }
            }
        }
    }
}