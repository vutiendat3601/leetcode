package tech.datvu.leetcode;

public class Leetcode_00112PathSum {

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        return hasPathSum(root, 0, targetSum);
    }

    private static boolean hasPathSum(TreeNode root, int currentSum, int targetSum) {
        if (root == null) {
            return false;
        }
        currentSum += root.val;
        if (currentSum> targetSum) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return currentSum == targetSum;
        }
        return hasPathSum(root.left, currentSum, targetSum) || hasPathSum(root.right, currentSum, targetSum);
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.createFromArray(new Integer[] { 5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1 });
        int targetSum = 22;
        boolean res = hasPathSum(root, targetSum);
        System.out.println(res);
    }
}
