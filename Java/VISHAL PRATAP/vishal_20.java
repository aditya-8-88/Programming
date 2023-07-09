import java.util.Scanner;
 public class vishal_20
 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int searchnumber;
        int foundIndex = -1;
        
        int list[] = {11,87,34,45,88,12,99,75,50};
        System.out.println("Enter numbers of search");
        searchnumber = sc.nextInt();
        
        for (int i = 0; i< list.length ; i++)
        {
            if(list[i] == searchnumber)
            {
                foundIndex = i;
                break;
            }
        }
        if( foundIndex >= 0 )
        System.out.println("Number"+searchnumber+"found at index"+foundIndex);
        else
         System.out.println("Number"+searchnumber+"not found");
         
         sc.close();
    }
 }