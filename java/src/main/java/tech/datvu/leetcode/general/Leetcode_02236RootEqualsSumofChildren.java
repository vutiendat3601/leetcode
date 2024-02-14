package tech.datvu.leetcode.general;

import tech.datvu.leetcode.shared.global.TreeNode;

public class Leetcode_02236RootEqualsSumofChildren {
    public static boolean checkTree(TreeNode root) {
        return root.left.val + root.right.val == root.val;
    }
}
