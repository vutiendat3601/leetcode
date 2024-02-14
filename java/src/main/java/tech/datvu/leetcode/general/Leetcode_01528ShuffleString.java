package tech.datvu.leetcode.general;

public class Leetcode_01528ShuffleString {

    public static String restoreString(String s, int[] indices) {
        StringBuilder res = new StringBuilder(s);
        for (int i = 0; i < indices.length; i++) {
            res.replace(indices[i], indices[i] + 1, s.substring(i, i + 1));
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };
        String res = restoreString(s, indices);
        System.out.println(res);
    }
}
