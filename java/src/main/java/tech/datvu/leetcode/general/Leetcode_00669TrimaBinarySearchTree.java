package tech.datvu.leetcode.general;

import tech.datvu.leetcode.shared.global.TreeNode;

public class Leetcode_00669TrimaBinarySearchTree {

    public static TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null) {
            return root;
        }
        if (root.val < low) {
            root.left = null;
            root = trimBST(root.right, low, high);
        } else if (root.val > high) {
            root.right = null;
            root = trimBST(root.left, low, high);
        } else {
            root.left = trimBST(root.left, low, high);
            root.right = trimBST(root.right, low, high);
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.createFromArray(new Integer[] { 1, null, 2 });
        int low = 1;
        int high = 2;
        root = trimBST(root, low, high);
        // root = deleteNode(root, 2);
        System.out.println();
    }
}
