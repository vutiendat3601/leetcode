package tech.datvu.leetcode.general;

public class Leetcode_00944DeleteColumnstoMakeSorted {

    public static int minDeletionSize(String[] strs) {
        int cnt = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            char cmp = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                char nextCmp = strs[j].charAt(i);
                if (nextCmp < cmp) {
                    cnt++;
                    break;
                }
                cmp = nextCmp;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        String[] strs = { "rrjk", "furt", "guzm" };
        int res = minDeletionSize(strs);
        System.out.println(res);
    }
}
