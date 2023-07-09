package tech.datvu.leetcode;

import java.util.Stack;

public class Leetcode_00114FlattenBinaryTreetoLinkedList {

    public static void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        while (!s.isEmpty()) {
            TreeNode cur = s.pop();

            if (cur.right != null) {
                s.push(cur.right);
            }
            if (cur.left != null) {
                s.push(cur.left);
            }

            if (!s.isEmpty()) {
                cur.right = s.peek();
            }
            cur.left = null;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.createFromArray(new Integer[] { 1, 2, 5, 3, 4, 7, 6 });
        flatten(root);
    }
}
