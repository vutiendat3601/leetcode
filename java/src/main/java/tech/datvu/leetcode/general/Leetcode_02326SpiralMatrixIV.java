package tech.datvu.leetcode.general;

import tech.datvu.leetcode.shared.global.ListNode;

public class Leetcode_02326SpiralMatrixIV {

    public static int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] res = new int[m][n];

        // input
        int l = 0, t = 0;
        int r = n - 1, b = m - 1;
        int i = 0, j = 0;

        boolean row = true;
        boolean lr = true;
        boolean td = false;

        while (i++ <= n * m + 1) {
            int val = -1;
            if (head != null) {
                val = head.val;
                head = head.next;
            }
            if (row) {
                // left to right
                if (lr && j <= r) {
                    res[t][j++] = val;
                    if (j > r) {
                        t++;
                        j = t;
                        td = true;
                        row = false;
                    }
                }
                // right to left
                else if (!lr && j >= l) {
                    res[b][j--] = val;
                    if (j < l) {
                        b--;
                        j = b;
                        td = false;
                        row = false;
                    }
                }
            } else {
                // top to down
                if (td && j <= b) {
                    res[j++][r] = val;
                    if (j > b) {
                        r--;
                        j = r;
                        lr = false;
                        row = true;
                    }
                }
                // down to top
                else if (!td && j >= t) {
                    res[j--][l] = val;
                    if (j < t) {
                        l++;
                        j = l; // ***
                        lr = true;
                        row = true;
                    }
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        ListNode head = ListNode
                .createFromArray(new int[] { 995, 348, 36, 516, 333, 627, 248, 422, 13, 225, 764, 311, 405, 695, 698,
                        83, 145, 783, 478 });
        int[][] res = spiralMatrix(9, 6, head);
        for (int x = 0; x < res.length; x++) {
            System.out.println(java.util.Arrays.toString(res[x]));
        }
        System.out.println();
    }
}
