package tech.datvu.leetcode;

public class Leetcode_00067AddBinary {
    public static String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int aI = a.length() - 1;
        int bI = b.length() - 1;
        int carry = 0;
        while (aI >= 0 || bI >= 0) {
            int sum = 0;
            sum += aI >= 0 ? Integer.parseInt(String.valueOf(a.charAt(aI--))) : 0;
            sum += bI >= 0 ? Integer.parseInt(String.valueOf(b.charAt(bI--))) : 0;
            sum += carry;
            carry = sum > 1 ? 1 : 0;
            res.append(sum % 2);
        }
        if (carry > 0) {
            res.append(1);
        }
        return res.reverse().toString();

    }

    public static void main(String[] args) {
        System.out.println(addBinary("1010", "1011"));
    }
}
