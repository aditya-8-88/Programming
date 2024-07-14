import java.util.Scanner;
class Anshul_15//Menu driven
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1. Display Unicode Value");
        System.out.println("2. Display pattern");
        System.out.println("Enter the choice:");
        
        int a = sc.nextInt();
        switch (a)
        {
            case 1:
                 System.out.println("Letters \t Unicode ");
                 for (char ch = 'a';ch <= 'z';ch++)
                 System.out.println(ch + "\t" + (int)ch);
                 
              break;
                 
            case 2:
                  for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System. out.print(j + " ");
            }
                System. out.println();
        } 
        break;
        
        default:
          System.out.println("Invalid choice entered");
        }
    }
}