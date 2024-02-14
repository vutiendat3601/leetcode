package tech.datvu.leetcode.general;

public class Leetcode_00096UniqueBinarySearchTrees {

    private static int[] cnts = new int[20];

    public static int numTrees(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int trees = 0;
        for (int i = 1; i <= n; i++) {
            if (cnts[i - 1] == 0) {
                cnts[i - 1] = numTrees(i - 1);
            }
            if (cnts[n - i] == 0) {
                cnts[n - i] = numTrees(n - i);
            }
            trees += cnts[i - 1] * cnts[n - i];
        }
        return trees;
    }

    public static void main(String[] args) {
        int n = 4;
        int res = numTrees(n);
        System.out.println(res);
    }
}
