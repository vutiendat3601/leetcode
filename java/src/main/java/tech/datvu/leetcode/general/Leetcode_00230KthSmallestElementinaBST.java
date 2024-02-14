package tech.datvu.leetcode.general;

import java.util.ArrayList;
import java.util.List;

import tech.datvu.leetcode.shared.global.TreeNode;

public class Leetcode_00230KthSmallestElementinaBST {
    private static List<Integer> container = new ArrayList<>();
    private static int cnt;

    public static int kthSmallest(TreeNode root, int k) {
        preTraversal(root);
        cnt = k;
        return container.get(k - 1);
    }

    public static void preTraversal(TreeNode root) {
        if (root.left != null) {
            preTraversal(root.left);
        }
        container.add(root.val);
        cnt--;
        if (cnt == 0) {
            return;
        }
        if (root.right != null) {
            preTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.createFromArray(new Integer[] { 5, 3, 6, 2, 4, null, null, 1 });
        int k = 3;
        int res = kthSmallest(root, k);
        System.out.println(res);
    }
}
