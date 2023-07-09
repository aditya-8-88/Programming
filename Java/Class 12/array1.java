import java .util.Scanner;
public class array1
{
    int an[];
    array1()
    {
        an=new int[10];
    }
    void fill()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter admission numbers in ascending order:");
        for(int i=0;i<10;i++)
        an[i]=sc.nextInt();        
    }
    int binSearch()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter admission number for binary search:");
        int n=sc.nextInt();
        int flag=0,u=9,l=0;
        while(l<=u)
        {
            int m=(u+l)/2;
            if(n>an[m])
            l=m+1;
            else if(n<an[m])
            u=m-1;
            else
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        return 1;
        else
        return 0;      
    }
    void display()
    {
        int i=binSearch();
        if(i==1)
        System.out.println("Element found");
        else
        System.out.println("Element not found");
    }
    public static void main(String args[])
    {
        array1 cs=new array1();
        cs.fill();
        cs.display();
    }
}