import java.util.*;

public class main {
    public static void main(String[] args) {
        // declare a matrix
        // make a random matrix
        // display fuction
        // if(empty cell at right place) then check validity
        // shuffle option
        // feedback section for incorrect inputs
        
        int[][] arr = new int[3][3];
        create(arr);
        display(arr);
        // asdw key strokes to slide then show again
        Scanner sc = new Scanner(System.in);

        int[] p = {2,2}; 
        while(true){
            if(arr[2][2]==0){
                if(check(arr)) {
                    System.out.println("SUCCESS!! Game over");
                }
                // else 
                    // System.out.println("Not yet");
            }
            
            System.out.print("Your Input : ");
            char ch = sc.nextLine().charAt(0);



            if(ch == 'a'){
                int r = p[0];
                int c = p[1]-1;
                try{
                    p[1] = c;
                    arr[r][c+1] = arr[r][c];
                    arr[r][c] = 0;
                    display(arr);
                }
                catch(Exception e) {
                    p[1] = c+1;
                    System.out.println("Remain in the Boundary");
                }
            }
            else if(ch == 'd'){
                int r = p[0];
                int c = p[1]+1;
                try{
                    p[1] = c;
                    arr[r][c-1] = arr[r][c];
                    arr[r][c] = 0;
                    display(arr);
                }
                catch(Exception e) {
                    p[1] = c-1;
                    System.out.println("Remain in the Boundary");
                }
            }
            else if(ch == 'w'){
                int r = p[0]-1;
                int c = p[1];
                try{
                    p[0] = r;
                    arr[r+1][c] = arr[r][c];
                    arr[r][c] = 0;
                    display(arr);
                }
                catch(Exception e) {
                    p[0] = r+1;
                    System.out.println("Remain in the Boundary");
                }
            }
            else if(ch == 's'){
                int r = p[0]+1;
                int c = p[1];
                try{
                    p[0] = r;
                    arr[r-1][c] = arr[r][c];
                    arr[r][c] = 0;
                    display(arr);
                }
                catch(Exception e) {
                    p[0] = r-1;
                    System.out.println("Remain in the Boundary");
                }
            }
            else if(ch == 'q'){
                System.exit(0);
            }
        }
        
        // display(arr);
    }

    public static void create(int[][] arr) {
        int[] hash = { 2, 5, 3, 6, 1, 4, 8, 7 };
        int k = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 2 && j == 2)
                    continue;
                arr[i][j] = hash[k++];
            }
        }
    }

    public static boolean check(int[][] arr){
        int k = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 2 && j == 2)
                    continue;
                if(arr[i][j] != k++) return false;
            }
        }
        return true;
    }

    public static void display(int[][] arr) {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("Swapping moves : left = a ; right = d ; up = w ; down = s ; quitting the game : q");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] == 0)
                    System.out.print(" | =");
                else
                    System.out.print(" | " + arr[i][j]);
            }
            System.out.println(" |");
        }

    }
}