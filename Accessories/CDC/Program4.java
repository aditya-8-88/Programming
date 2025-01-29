// import java.util.*;

// public class Program4 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] cost = new int[n];
//         int[] weight = new int[n];

//         String s1 = sc.next();
//         String[] ss1 = s1.split(",");

//         String s2 = sc.next();
//         String[] ss2 = s2.split(",");

//         sc.nextLine();
//         int max = sc.nextInt();

//         public static int rotateLeft(int i, int distance) {

//         for (int i = 0; i < n; i++) {
//             cost[i] = Integer.parseInt(ss1[i]);
//             weight[i] = Integer.parseInt(ss2[i]);
//         }

//         // 5
//         // 10,5,15,7,6
//         // 2,3,5,4,2
//         // 10

//         System.out.println(fn(cost, weight, max, n));
//         sc.close();
//     }

//     static int fn(int[] cost, int[] w, int sum, int n) {
//         if (sum < 0)
//             return 0;
//         if (n < 1)
//             return 0;
//         if (w[n - 1] < sum)
//             return Math.max(cost[n - 1] + fn(cost, w, sum - w[n - 1], n - 1), fn(cost, w, sum, n - 1));
//         else
//             return fn(cost, w, sum, n - 1);
//         // return 0;

//     }

// }
