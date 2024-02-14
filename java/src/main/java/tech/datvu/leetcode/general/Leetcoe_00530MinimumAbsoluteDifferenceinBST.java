package tech.datvu.leetcode.general;

import java.util.ArrayList;
import java.util.List;

import tech.datvu.leetcode.shared.global.TreeNode;

public class Leetcoe_00530MinimumAbsoluteDifferenceinBST {

    private static List<Integer> data = new ArrayList<>();

    public static int getMinimumDifference(TreeNode root) {
        travers(root);
        int res = Integer.MAX_VALUE;
        for (int i = 1; i < data.size(); i++) {
            res = Math.min(res, Math.abs(data.get(i - 1) - data.get(i)));
        }
        return res;
    }

    public static void travers(TreeNode root) {
        if (root == null) {
            return;
        }
        travers(root.left);
        data.add(root.val);
        travers(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.createFromArray(new Integer[] { 236, 104, 701, null, 227, null, 911 });
        int res = getMinimumDifference(root);
        System.out.println(res);
    }
}
