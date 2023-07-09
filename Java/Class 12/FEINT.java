import java.util.Scanner;
public class FEINT
{
     String S1,S2;
     int fd;
     FEINT()
     {
         S1="";
         S2="";
         fd=0;         
     }
     void fnInput()
     {
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter both the strings one by one:");
         S1=sc.nextLine();
         S2=sc.nextLine();
     }
     void fnSetFeint()
     {
         int l1=S1.length();
         int l2=S2.length();
         int l;
         if(l1>l2)
         {
             l=l2;
             fd=l1-l2;
         }
         else if(l2>l1)
         {
             l=l1;
             fd=l2-l1;
         }
         else
         l=l1;
         for(int i =0;i<l;i++)
         {
             if(S1.charAt(i)==S2.charAt(i))
             fd+=0;
             else
             fd+=1;
         }
     }
     void fnShow()
     {
         System.out.println("String 1: "+S1);
         System.out.println("String 2: "+S2);
         System.out.println("Feint Distance: "+fd);
     }
     public static void main(String args[])
     {
         FEINT cs= new FEINT();
         cs.fnInput();
         cs.fnSetFeint();
         cs.fnShow();
     }
}