import java.util.Scanner;
 public class result
 {
    public static void main(String args[])
    {
        String[] subject ={"Englit:","Englang:","Hindi:","Computer:","Maths:","Physics:","Chemistry:","Biology:","History:","Geography:"};
        String[] subSubject = {"English","Hindi:","Computer:","Maths:","Science","Sst"};
        int[] marks = new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks: ");
        for (int i=0;i<10;i++)
        {
            System.out.print(subject[i]);
            marks[i]=sc.nextInt();
        }
        int sum=0;
        for(int i= 0;i<10;i++)
        sum+=marks[i];
        double oriPer = sum/6;
        System.out.println("Original percentage : "+oriPer);
    }
}