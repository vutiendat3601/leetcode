package tech.datvu.leetcode;

public class Leetcode_00563BinaryTreeTilt {

    private static int max = 0;

    public static int findTilt(TreeNode root) {
        loop(root);
        return max;
    }

    public static int loop(TreeNode root) {
        if (root == null)
            return 0;
        int left = loop(root.left);
        int right = loop(root.right);
        max += Math.abs(left - right);
        return root.val + left + right;
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.createFromArray(new Integer[] { 4, 2, 9, 3, 5, null, 7 });
        int res = findTilt(root);
        System.out.println(res);
    }
}
