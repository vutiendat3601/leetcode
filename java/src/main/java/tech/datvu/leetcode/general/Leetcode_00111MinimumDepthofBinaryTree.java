package tech.datvu.leetcode.general;

import tech.datvu.leetcode.shared.global.TreeNode;

public class Leetcode_00111MinimumDepthofBinaryTree {
    public static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null) {
            return minDepth(root.right) + 1;
        }
        if (root.right == null) {
            return minDepth(root.left) + 1;
        }
        return Integer.min(minDepth(root.left), minDepth(root.right)) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.createFromArray(new Integer[] { 2, null, 3, null, 4, null, 5, null, 6 });
        int res = minDepth(root);
        System.out.println(res);
    }
}
