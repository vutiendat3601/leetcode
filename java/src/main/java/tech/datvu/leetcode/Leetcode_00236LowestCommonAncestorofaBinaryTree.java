package tech.datvu.leetcode;

public class Leetcode_00236LowestCommonAncestorofaBinaryTree {

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.createFromArray(new Integer[] { 1, 2, 3, null, 4 });
        TreeNode p = root.left.right;
        TreeNode q = root.right;

        TreeNode res = lowestCommonAncestor(root, p, q);
        System.out.println(res.val);
        System.out.println("END PROGRAM.");
    }
}
