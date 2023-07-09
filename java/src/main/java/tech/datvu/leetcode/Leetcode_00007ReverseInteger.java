package tech.datvu.leetcode;

public class Leetcode_00007ReverseInteger {

    public static int reverse(int x) {
        StringBuilder temp = new StringBuilder(String.valueOf(x));
        if (x < 0) {
            temp.deleteCharAt(0);
        }
        temp.reverse();
        long l = Long.parseLong(temp.toString());
        return l > Integer.MAX_VALUE ? -1 : x < 0 ? -(int) l : (int) l;
    }

    public static void main(String[] args) {
        int x = -123;
        int res = reverse(x);
        System.out.println(res);
    }
}
