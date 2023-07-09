package tech.datvu.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_00102BinaryTreeLevelOrderTraversal {
    private static List<List<Integer>> result;
    static {
        result = new ArrayList<>();
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        if (root != null) {
            traversal(root, 0);
        }
        return result;
    }

    public static void traversal(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (result.size() == level) {
            result.add(new ArrayList<>());
        }
        result.get(level).add(root.val);
        traversal(root.left, level + 1);
        traversal(root.right, level + 1);
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.createFromArray(new Integer[] { 3, 9, 20, null, null, 15, 7 });
        levelOrder(root);
        System.out.println("END PROGRAM.");
    }
}
