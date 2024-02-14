package tech.datvu.leetcode.general;

import tech.datvu.leetcode.shared.global.TreeNode;

public class Leetcode_01022SumofRootToLeafBinaryNumbers {

    private static int sum = 0;
    private static int[] bin = new int[1001];

    public static int sumRootToLeaf(TreeNode root) {
        sumRootToLeaf(root, 1);
        return sum;
    }

    public static int binToDec(int[] bin, int n) {
        int sum = 0;
        for (int i = n; i >= 1; i--) {
            if (bin[i] == 0) {
                continue;
            }
            sum += Math.pow(2, n - i);
        }
        return sum;
    }

    public static void sumRootToLeaf(TreeNode root, int iTh) {
        bin[iTh] = root.val;
        if (root.left == null && root.right == null) {
            sum += binToDec(bin, iTh);
        }
        if (root.left != null) {
            sumRootToLeaf(root.left, iTh + 1);
        }
        if (root.right != null) {
            sumRootToLeaf(root.right, iTh + 1);
        }
    }

    public static void main(String[] args) {
        TreeNode n0 = new TreeNode(1);
        TreeNode n0Left = new TreeNode(0);
        TreeNode n0Right = new TreeNode(1);
        TreeNode n0LeftLeft = new TreeNode(0);
        TreeNode n0LeftRight = new TreeNode(1);
        TreeNode n0RightLeft = new TreeNode(0);
        TreeNode n0RightRight = new TreeNode(1);

        n0.left = n0Left;
        n0.right = n0Right;
        n0Left.left = n0LeftLeft;
        n0Left.right = n0LeftRight;
        n0Right.left = n0RightLeft;
        n0Right.right = n0RightRight;

        TreeNode root = n0;

        System.out.println(sumRootToLeaf(root));

    }
}
