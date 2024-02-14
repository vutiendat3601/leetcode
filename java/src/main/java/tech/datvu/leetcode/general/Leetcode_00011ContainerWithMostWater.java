package tech.datvu.leetcode.general;

public class Leetcode_00011ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int res = 0;
        int area = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            boolean leftLower = false;
            area = right - left;
            area *= (leftLower = height[left] < height[right]) ? height[left] : height[right];
            res = res > area ? res : area;
            if (leftLower) {
                left++;
            } else {
                right--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int res = maxArea(height);
        System.out.println(res);
    }
}
