package tech.datvu.leetcode;

public class Leetcode_00110BalancedBinaryTree {

    public static boolean isBalanced(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return true;
        }
        if (Math.abs(height(root.left) - height(root.right)) >= 2) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public static int height(TreeNode root) {
        if (root == null) {
            return -1;
        }
        if (root.left == null && root.right == null) {
            return 0;
        }
        return Integer.max(height(root.left), height(root.right)) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.createFromArray(new Integer[] { 1, 2, 2, 3, null,
                null, 3, 4, null, null, 4 });
        boolean res = isBalanced(root);
        System.out.println(res);
    }
}