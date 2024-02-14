package tech.datvu.leetcode.general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import tech.datvu.leetcode.shared.global.TreeNode;

public class Leetcode_00501FindModeinBinarySearchTree {

    private static List<Integer> cnts = new ArrayList<>();
    private static int cnt = 0;
    private static int max = 0;
    private static int curVal = Integer.MIN_VALUE;

    public static int[] findMode(TreeNode root) {
        if (root == null) {
            return new int[0];
        }
        traverInorder(root);
        int[] res = new int[cnts.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = cnts.get(i);
        }
        return res;
    }

    public static void traverInorder(TreeNode root) {
        if (root == null) {
            return;
        }
        traverInorder(root.left);
        if (root.val == curVal) {
            cnt++;
        } else {
            curVal = root.val;
            cnt = 1;
        }
        if (cnt == max) {
            cnts.add(curVal);
        } else if (cnt > max) {
            max = cnt;
            cnts.clear();
            cnts.add(curVal);
        }
        traverInorder(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.createFromArray(new Integer[] { 1, null, 2, 2 });
        int[] res = findMode(root);
        System.out.println(Arrays.toString(res));
    }
}
