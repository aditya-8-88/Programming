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

    }

    void dfs(TreeNode node) {
        if (node == null)
            return;

        int val = node.val;
        // processing

        dfs(node.left);
        dfs(node.right);
    }
}