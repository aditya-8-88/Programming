import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class problem3 {
    public static TreeNode create(Integer[] arr) {
        if (arr == null || arr.length == 0)
            return null;

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (i < arr.length) {
            TreeNode current = queue.poll();

            if (arr[i] != null) {
                current.left = new TreeNode(arr[i]);
                queue.add(current.left);
            }
            i++;

            if (i < arr.length && arr[i] != null) {
                current.right = new TreeNode(arr[i]);
                queue.add(current.right);
            }
            i++;
        }

        return root;
    }

    public static boolean check(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        } else if (root1 == null || root2 == null) {
            return false;
        }

        return check(root1.left, root2.left) && check(root1.right, root2.right);
    }

    public static void main(String[] args) {
        Integer[] arr1 = { 1, 2, 3, 4, 5, 6, 7 };
        Integer[] arr2 = { 1, 2, 3, null, 5, 6, 7 };
        TreeNode root1 = create(arr1);
        TreeNode root2 = create(arr2);

        if (check(root1, root2))
            System.out.println("Yes both the trees are equal");
        else
            System.out.println("No both the trees are not equal");

    }
}