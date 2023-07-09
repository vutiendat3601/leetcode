package tech.datvu.leetcode;

public class Leetcode_00337HouseRobberIII {

    public static int rob(TreeNode root) {
        int[] num = dfs(root);
        return Math.max(num[0], num[1]);
    }

    private static int[] dfs(TreeNode x) {
        if (x == null)
            return new int[2];
        int[] left = dfs(x.left);
        int[] right = dfs(x.right);
        int[] res = new int[2];
        res[0] = left[1] + right[1] + x.val;
        res[1] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.createFromArray(new Integer[] { 3, 2, 3, null, 3, null, 1 });
        // TreeNode.traverLevel(head);
        int res = rob(root);
        System.out.println(res);
        // Map<TreeNode, Integer> s = new HashMap<>();
        // int x = s.put(null, null);
    }
}
