import java.util.Scanner;

public class MinimumSteps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start_index = sc.nextInt();
        sc.nextLine();
        String search_word = sc.nextLine();

        String arr[] = { "saw", "hammer", "mallet", "file", "saw", "ladder", "scissor" };
        int found_index = -1;
        int l = arr.length;

        for (int i = 0; i < l; i++) {
            if (arr[i].equals(search_word)) {
                found_index = i;
                break;
            }
        }

        if (found_index != -1) {
            int m = Math.abs(found_index - start_index);
            System.out.println("Minimum steps = " + Math.min(m, l - m));
        } else {
            System.out.println("not found");
        }
        sc.close();
    }
}

/*
 * Algorithm :-
 * 1) input --> start_index and search_word
 * 2) since unsorted therefore going with linear search --> getting the index
 * 3) performing maths between start_index and found_index
 * 4) output the result
 */