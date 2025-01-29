import java.util.*;

public class problem1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.nextLine();
        String[] ss1 = s1.split(",");
        int n= ss1.length;

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(ss1[i]);


        System.out.println(calc(arr));
        sc.close();
    }

    public static int calc(int[] arr){
        return 0;
    }
}