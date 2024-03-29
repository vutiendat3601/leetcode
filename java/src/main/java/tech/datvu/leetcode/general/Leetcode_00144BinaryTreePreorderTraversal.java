package tech.datvu.leetcode.general;

import java.util.ArrayList;
import java.util.List;

import tech.datvu.leetcode.shared.global.TreeNode;

public class Leetcode_00144BinaryTreePreorderTraversal {

    private static List<Integer> res = new ArrayList<>();

    public static List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return res;
        }
        res.add(root.val);
        if (root.left != null) {
            preorderTraversal(root.left);
        }
        if (root.right != null) {
            preorderTraversal(root.right);
        }
        return res;
    }
}
