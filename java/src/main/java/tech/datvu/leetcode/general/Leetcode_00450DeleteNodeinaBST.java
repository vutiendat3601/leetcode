package tech.datvu.leetcode.general;

import tech.datvu.leetcode.shared.global.TreeNode;

public class Leetcode_00450DeleteNodeinaBST {

    private int findMinLeftNodeValue(TreeNode root) {
        int res = root.val;
        while (root.left != null) {
            root = root.left;
            res = root.val;
        }
        return res;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return root;
        }
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }
            int minLeftNodeValue = findMinLeftNodeValue(root.right);
            root.val = minLeftNodeValue;
            root.right = deleteNode(root.right, minLeftNodeValue);
        }
        return root;
    }
}