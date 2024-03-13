import java.util.Scanner;

public class Sample// a sample output
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word:");
        String st1 = sc.nextLine();
        System.out.print("Enter a word:");
        String st2 = sc.nextLine();
        for (int i = st1.length(); i > 0; i--)
            if (i != 1)
                System.out.println(st1.substring(0, i));
            else
                System.out.print(st1.substring(0, i));
        for (int i = 0; i <= st2.length(); i++)
            System.out.println(st2.substring(0, i));
    }
}