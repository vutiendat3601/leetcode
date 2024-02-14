package tech.datvu.leetcode.general;

import tech.datvu.leetcode.shared.global.TreeNode;

public class Leetcode_00098ValidateBinarySearchTree {

    public static boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static boolean isValidBST(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }
        if (root.val <= min || root.val >= max) {
            return false;
        }
        return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.createFromArray(new Integer[] { 5, 4, 6, null, null, 3, 7 });
        boolean res = isValidBST(root);
        System.out.println(res);
    }
}