package tech.datvu.leetcode.general;

import tech.datvu.leetcode.shared.global.TreeNode;

public class Leetcode_00235LowestCommonAncestorofaBinarySearchTree {

    public static TreeNode lowest(TreeNode root, int p, int q) {
        if (p < root.val && q < root.val) {
            return lowest(root.left, p, q);
        } else if (p > root.val && q > root.val) {
            return lowest(root.right, p, q);
        }
        return root;
    }
    
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val > q.val) {
            return lowest(root, q.val, p.val);
        }
        return lowest(root, p.val, q.val);
    }

    public static TreeNode find(TreeNode root, int val) {
        if (root != null && root.val == val) {
            return root;
        }
        if (val < root.val) {
            return find(root.left, val);
        } else if (val > root.val) {
            return find(root.right, val);
        }
        return null;
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.createFromArray(new Integer[] { 6, 2, 8, 0, 4, 7, 9, null, null, 3, 5 });
        TreeNode p = find(root, 2);
        TreeNode q = find(root, 4);
        TreeNode res = lowestCommonAncestor(root, p, q);
        System.out.println(res.val);
    }
}
