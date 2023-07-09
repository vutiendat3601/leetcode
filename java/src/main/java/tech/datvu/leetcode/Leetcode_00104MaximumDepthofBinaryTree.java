package tech.datvu.leetcode;

public class Leetcode_00104MaximumDepthofBinaryTree {

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return Integer.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.createFromArray(new Integer[] {1,null,2 });
        int res = maxDepth(root);
        System.out.println(res);
    }
}
