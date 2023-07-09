package tech.datvu.leetcode;

public class Leetcode_00226InvertBinaryTree {
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        if (root.left == null && root.right == null) {
            return root;
        }
        if (root.left == null) {
            root.left = invertTree(root.right);
        }
        if (root.right == null) {
            root.right = invertTree(root.left);
        }
        TreeNode leftReverse = invertTree(root.left);
        TreeNode rightReverse = invertTree(root.right);
        root.left = rightReverse;
        root.right = leftReverse;
        return root;
    }

    public static void main(String[] args) {
        // TreeNode n4 = new TreeNode(4);
        TreeNode n2 = new TreeNode(2);
        // TreeNode n7 = new TreeNode(7);
        TreeNode n1 = new TreeNode(1);
        // TreeNode n3 = new TreeNode(3);
        // TreeNode n6 = new TreeNode(6);
        // TreeNode n9 = new TreeNode(9);

        n1.right = n2;

        // TreeNode root = n1;

        // TreeNode res = invertTree(root);
        System.out.println();
    }
}
