import java.util.*;

public class Program2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // int[] weight = new int[n];
        
        String s1 = sc.next();
        String[] ss1 = s1.split(",");
        int l= ss1.length;

        int[] arr = new int[l];
        for (int i = 0; i < l; i++)
            arr[i] = Integer.parseInt(ss1[i]);

        if(m>n)
            System.out.println("not possible");
        else{
            Arrays.sort(arr);
            int i =0 ;
            int j = m-1;
            int min = Integer.MAX_VALUE;

            while(j<n){
                min = Math.min(min, arr[j]-arr[i]);
                i++;
                j++;
            }
            System.out.println(min);
        }




        // int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        // int[] arr = {5,4,-1,7,8};
        // int[] arr = {-4,-3,-1,-2};

        // System.out.println(fn(arr));
        sc.close();
    }

    // static int fn(int[] nums) {
    //     int max = Integer.MIN_VALUE;
    //     int sum = 0, i = 0;
    //     while (i < nums.length) {
    //         sum += nums[i];
    //         if (sum < 0) {
    //             max = Math.max(max, sum);
    //             sum = 0;
    //         }
    //         else if (max < sum) {
    //             max = sum;
    //         }
    //         i++;
    //     }
    //     return max;

    // }
}