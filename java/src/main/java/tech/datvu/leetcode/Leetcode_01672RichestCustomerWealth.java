package tech.datvu.leetcode;

public class Leetcode_01672RichestCustomerWealth {

    public static int maximumWealth(int[][] accounts) {
        int res = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j =0;j<accounts[0].length;j++) {
                sum+=accounts[i][j];
            }
            res = res > sum ? res : sum;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        int res = maximumWealth(accounts);
        System.out.println(res);
    }
}
