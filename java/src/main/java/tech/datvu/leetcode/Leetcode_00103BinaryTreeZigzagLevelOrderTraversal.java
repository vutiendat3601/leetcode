package tech.datvu.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leetcode_00103BinaryTreeZigzagLevelOrderTraversal {
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> results = new ArrayList<>();
        if (root != null) {
            boolean even = true;
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            while (!q.isEmpty()) {
                LinkedList<Integer> temp = new LinkedList<>();
                int size = q.size();
                for (int i = 0; i < size; i++) {
                    TreeNode node = q.poll();
                    if (even) {
                        temp.addLast(node.val);
                    } else {
                        temp.addFirst(node.val);
                    }
                    if (node.left != null) {
                        q.add(node.left);
                    }
                    if (node.right != null) {
                        q.add(node.right);
                    }
                }
                if (!temp.isEmpty()) {
                    results.add(temp);
                }
                even = !even;
            }
        }
        return results;
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.createFromArray(new Integer[] { 1, 2, 3, 4, null, null, 5 });
        List<List<Integer>> res = zigzagLevelOrder(root);
        System.out.println(res.toString());
    }
}
