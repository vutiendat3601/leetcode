package tech.datvu.leetcode.general;

import tech.datvu.leetcode.shared.global.TreeNode;

public class Leetcode_00108ConvertSortedArraytoBinarySearchTree {
    public static TreeNode sortedArrayToBST(int[] nums) {
        return insert(nums, 0, nums.length - 1);
    }

    private static TreeNode insert(int[] nums, int left, int right) {

        // Neu mang khong ton tai
        if (left > right) {
            return null;
        }

        // Neu mang chi co 1 phan tu
        if (left == right) {
            return new TreeNode(nums[left]);
        }

        // Dat root bang gia tri o giua
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);

        /* Bai toan con cua bai toan lon */
        // Gan ve trai bang gia tri o ben trai mang
        root.left = insert(nums, left, mid - 1);
        // Gan ve phai bang gia tri o ben phai mang
        root.right = insert(nums, mid + 1, right);
        return root;
    }

    public static void main(String[] args) {
        int[] nums = { -10, -3, 2, 3, 4, 5 };
        TreeNode res = sortedArrayToBST(nums);
        TreeNode.preTraversalNode(res);
        System.out.println();
    }
}
