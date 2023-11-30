package tech.datvu.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode_00958CheckCompletenessOfABinaryTree {
    public static boolean isCompleteTree(TreeNode root) {
        boolean nonFullNodeFound = false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.peek();
            queue.poll();
            if (node == null) {
                nonFullNodeFound = true;
            } else {
                if (nonFullNodeFound) {
                    return false;
                }
                queue.add(node.left);
                queue.add(node.right);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.createFromArray(1, 2, 3, 4, 5, null, 7);
        System.out.println(isCompleteTree(root));
    }
}
