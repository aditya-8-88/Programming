// import java.util.Scanner;
import java.util.Arrays;

public class MergeInterval {

    public int[][] merge(int[][] arr) {
        int[][] result = new int[arr.length][2];
        int c = 0;
        int lower = arr[c][0];
        int upper = arr[c][1];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i][0] - arr[i - 1][1] <= 0) {
                upper = arr[i][1];
                continue;
            } else {
                result[c++] = new int[]{lower, upper};
                lower = arr[i][0];
                upper = arr[i][1];
            }
        }
        result[c++] = new int[]{lower, upper};
        return Arrays.copyOf(result, c);

    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        MergeInterval obj = new MergeInterval();
        int[][] result = obj.merge(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + " " + result[i][1]);
        }
        System.out.println("The merged intervals are");

    }
}

/*
 * Algorithm :-
 * 1) pass a 2D matrix from main
 * 2) sort the intervals in increasing order
 * 3) use variable for pointing purpose, use while loop and upon failure add the
 * resulting interval to the new array
 * 4) output the result
 */