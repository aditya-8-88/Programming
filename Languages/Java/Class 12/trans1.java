import java.util.Scanner;
public class trans1
{
    int dn, sd;
    int dna[];
    trans1()
    {
        dn=0;
        sd=0;
    }
    int countDigits(int n)
    {
        int c=n,count=0;
        while(c>0)
        {
            c/=10;
            count++;
        }
        return count;
    }
    void fnBegin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer:");
        dn=sc.nextInt();
        sd=countDigits(dn);
        dna=new int[sd-1];
        int d,c=dn;
        for(int i=1;i<=sd && c>0;i++)
        {
            d=c%10;
            dna[i]=d;
            c=c/10;
        }
    }
    void display()
    {
        System.out.println("Integer:  "+dn);
        System.out.println("Array is:");
        for(int i =0;i<sd;i++)
        System.out.print(dna[i]+"\t");
    }
    public static void main(String arg[])
    {
        trans1 cs=new trans1();
        cs.fnBegin();
        cs.display();
    }
}