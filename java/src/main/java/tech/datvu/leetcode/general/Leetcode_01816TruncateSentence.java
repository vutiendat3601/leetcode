package tech.datvu.leetcode.general;

public class Leetcode_01816TruncateSentence {

    public static String truncateSentence(String s, int k) {
        StringBuilder res = new StringBuilder();
        String[] temp = s.split(" ");
        for (int i = 0; i < temp.length; i++) {
            if (i == k - 1) {
                res.append(temp[i]);
                return res.toString();
            }
            res.append(temp[i]);
            res.append(" ");
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        String res = truncateSentence(s, k);
        System.out.println(res);
    }
}
