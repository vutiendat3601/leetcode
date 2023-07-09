package tech.datvu.leetcode;

public class Leetcode_02236RootEqualsSumofChildren {
    public static boolean checkTree(TreeNode root) {
        return root.left.val + root.right.val == root.val;
    }
}
