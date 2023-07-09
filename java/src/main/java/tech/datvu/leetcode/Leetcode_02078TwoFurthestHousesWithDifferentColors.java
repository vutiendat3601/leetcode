package tech.datvu.leetcode;

public class Leetcode_02078TwoFurthestHousesWithDifferentColors {

    public static int maxDistance(int[] colors) {
        int res = 0;
        int i = 0;
        int j = colors.length - 1;
        while (i < j && colors[i] == colors[j]) {
            j--;
        }
        res = j - i;
        j = colors.length - 1;
        while (i < j && colors[i] == colors[j]) {
            i++;
        }
        res = res > j - i ? res : j - i;
        return res;
    }

    public static void main(String[] args) {
        int[] colors = { 6, 6, 6, 6, 6, 6, 6, 6, 6, 19, 19, 6, 6 };
        int res = maxDistance(colors);
        System.out.println(res);
    }
}
