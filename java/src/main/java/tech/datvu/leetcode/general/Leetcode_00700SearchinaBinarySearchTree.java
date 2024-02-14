package tech.datvu.leetcode.general;

import tech.datvu.leetcode.shared.global.TreeNode;

public class Leetcode_00700SearchinaBinarySearchTree {
    public static TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (val < root.val) {
            return searchBST(root.left, val);
        }
        else if (val > root.val) {
            return searchBST(root.right, val);
        }
        return root;
    }

    public static void main(String[] args) {
        
    }
}
