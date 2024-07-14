import java.util.Scanner;
public class trans
{
    int dn, sd;
    int dna[];
    trans()
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
        System.out.println("Enter the integer:"+sd);
        int c=dn,d,i=sd-1;
        while(c>0)
        {
            d=c%10;
            dna[0]=d;
            c/=10;
            i--;
        }
    }
    void display()
    {
        System.out.println("Integer:  ");
        System.out.println("Array is:");
        for(int i =0;i<sd;i++)
        System.out.print(dna[i]+"\t");
    }
    public static void main(String arg[])
    {
        trans cs=new trans();
        cs.fnBegin();
        cs.display();
    }
}