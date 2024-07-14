public class vishal_18
{
    void overload2017(String a,char b)
    {
         int count=0;
         for(int d=0;d<a.length();d++)
         {
             char ch=a.charAt(d);
             if(b==ch)
             count++;
         }
         System.out.println(a);
         System.out.println(count);
    }
    void overload2017(String s1)
    {
         s1.toLowerCase();
         for(int d=0;d<s1.length();d++)
         {
             char i=s1.charAt(d);
             if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u')
             System.out.print(i);
         }
    }
}