package tech.datvu.leetcode.general;

public class Leetcode_00008StringToInteger {
    public int myAtoi(String s) {
        String numStr = "";
        final char[] chars = s.toCharArray();
        int i = 0;
        int signedValue = 1;
        while (i < chars.length && chars[i] == ' ') {
            i++;
        }
        if (isNumberSign(chars[i])) {
            signedValue = chars[i] == '-' ? -1 : signedValue;
            i++;
        }
        if (isDigit(chars[i]) < 0) {
            return 0;
        }
        while (i < chars.length) {
            if (isDigit(chars[i]) > -1) {
                numStr += chars[i];
                i++;
            } else {
                break;
            }
        }
        i = 0;
        while (i < numStr.length() - 1) {
            if (numStr.charAt(i) == '0') {
                i++;
            } else {
                break;
            }
        }
        numStr = numStr.substring(i);
        int res = parseInt(numStr, signedValue);
        return res;
    }

    private int parseInt(String numStr, int signedValue) {
        if (numStr.length() > 10) {
            return signedValue < 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
        char[] numChars = numStr.toCharArray();
        int i = numChars.length - 1;
        long base = 1;
        long tempRes = 0;
        while (i >= 0) {
            tempRes += isDigit(numChars[i]) * base;
            base *= 10;
            i--;
        }
        tempRes *= signedValue;
        int res = (int) tempRes;
        if (tempRes > Integer.MAX_VALUE) {
            res = Integer.MAX_VALUE;
        } else if (tempRes < Integer.MIN_VALUE) {
            res = Integer.MIN_VALUE;
        }
        return res;
    }

    private boolean isNumberSign(char c) {
        switch (c) {
            case '-':
            case '+':
                return true;
        }
        return false;
    }

    private int isDigit(char c) {
        switch (c) {
            case '0':
                return 0;
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "2147483646";
        Leetcode_00008StringToInteger stringToInteger8 = new Leetcode_00008StringToInteger();
        int res = stringToInteger8.myAtoi(s);
        System.out.println(res);
    }
}
