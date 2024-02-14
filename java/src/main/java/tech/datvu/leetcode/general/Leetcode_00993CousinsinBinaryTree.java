package tech.datvu.leetcode.general;

import tech.datvu.leetcode.shared.global.TreeNode;

public class Leetcode_00993CousinsinBinaryTree {

    public static boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xParent = findParent(root, x);
        TreeNode yParent = findParent(root, y);
        if (xParent == yParent) {
            return false;
        }
        int xDepth = depth(root, x);
        int yDepth = depth(root, y);
        return xDepth == yDepth;
    }

    public static TreeNode findParent(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.left == null && root.right == null) {
            return null;
        }
        if ((root.left != null && root.left.val == val) ||
                (root.right != null && root.right.val == val)) {
            return root;
        }
        TreeNode temp = findParent(root.left, val);
        if (temp != null) {
            return temp;
        }
        return findParent(root.right, val);
    }

    public static int depth(TreeNode root, int val) {
        if (root == null) {
            return -1;
        }
        int dist = -1;
        if (root.val == val) {
            return dist + 1;
        }
        int l = depth(root.left, val);
        int r = depth(root.right, val);
        if (l >= 0) {
            return l + 1;
        }
        if (r >= 0) {
            return r + 1;
        }
        return dist;
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        TreeNode n8 = new TreeNode(8);
        TreeNode n9 = new TreeNode(9);

        n1.left = n3;
        n1.right = n2;
        n2.left = n7;
        n2.right = n4;
        n4.left = n5;
        n4.right = n6;
        n5.right = n8;
        n6.right = n9;

        TreeNode root = n1;

        System.out.println(findParent(root, 8).val);
        System.out.println(findParent(root, 9).val);
    }
}
