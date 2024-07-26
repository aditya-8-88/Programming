// import java.util.*;

// public class NumberCombinations {

//   public static void permute(String prefix, String remaining, Set<String> result) {
//     int n = remaining.length();
//     if (n == 0)
//       result.add(prefix);
//     else
//       for (int i = 0; i < n; i++)
//         permute(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1, n), result);
//   }

//   public static void main(String[] args) {
//     String number = "113";
//     Set<String> result = new HashSet<>();
//     permute("", number, result);
//     System.out.println("Combinations of " + number + " are: " + result);
//   }
// }

import java.util.ArrayList;
import java.util.List;

public class Permutations {

  public static void main(String[] args) {
    
    Stack<Character> stk = new Stack<>();
    int[] nums = { 1, 2, 3 };
    List<List<Integer>> result =  new ArrayList<>();
    backtrack(result, new ArrayList<>(), nums);
    for (List<Integer> perm : result) {
      System.out.println(perm);
    }
  }
  
  private static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums) {
    if (tempList.size() == nums.length) {
      result.add(new ArrayList<>(tempList));
    } else {
      for (int i = 0; i < nums.length; i++) {
        if (tempList.contains(nums[i]))
          continue; // Element already exists, skip
        tempList.add(nums[i]);
        backtrack(result, tempList, nums);
        tempList.remove(tempList.size() - 1);
      }
    }
  }
}
