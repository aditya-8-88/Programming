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

public class Tree {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7}; // Input array (level-order representation)
        TreeNode root = createTreeFromArray(arr);

        // Perform DFS
        System.out.println("DFS Traversal:");
        dfs(root);
    }

    // Function to create a tree from an array
    public static TreeNode createTreeFromArray(Integer[] arr) {
        if (arr == null || arr.length == 0) return null;

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

    // DFS function
    static void dfs(TreeNode node) {
        if (node == null)
            return;

        System.out.print(node.val + " "); // Process node
        dfs(node.left); // Visit left subtree
        dfs(node.right); // Visit right subtree
    }
}
