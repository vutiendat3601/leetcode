package tech.datvu.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// Binary Search Tree
public class TreeNode {
    // Attributes
    public int val;
    public TreeNode left;
    public TreeNode right;

    // Constructors

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    // Input, output

    public static void preTraversalNode(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preTraversalNode(root.left);
        preTraversalNode(root.right);
    }

    public static <T extends Comparable<T>> void traverLevel(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            System.out.print(node.val + " ");
            if (node.left != null) {
                q.add(node.left);
            }
            if (node.right != null) {
                q.add(node.right);
            }
        }
        System.out.println();
    }

    // top to down, left to right
    public static TreeNode createFromArray(Integer[] nodes) {
        TreeNode head = null;
        Queue<Integer> data = new LinkedList<>(Arrays.asList(nodes));
        if (data.isEmpty()) {
            return head;
        }
        Queue<TreeNode> q = new LinkedList<>();
        head = new TreeNode(data.poll());
        q.add(head);
        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            Integer leftVal = data.poll();
            Integer rightVal = data.poll();
            node.left = leftVal == null ? null : new TreeNode(leftVal);
            node.right = rightVal == null ? null : new TreeNode(rightVal);
            if (node.left != null) {
                q.add(node.left);
            }
            if (node.right != null) {
                q.add(node.right);
            }
        }
        return head;
    }
}