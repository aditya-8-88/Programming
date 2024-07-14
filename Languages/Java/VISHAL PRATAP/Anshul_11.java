 import java.util.Scanner;
 public class Anshul_11
 {
    public static void main(String args[])
    {
        int a[], i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of an array");
        int b =sc.nextInt();
        a = new int[b];
        System.out.println ("Enter value of array");
        for (i = 0; i<b ; i++)
        {
            a[i] = sc.nextInt();
        }
        for (j = 0; j<b ; j++)
        {
            System .out. print(a[j]);
        }
    }
 }