package tech.datvu.leetcode.top150.arraystring;

public class MajorityElement169 {
    
    public int majorityElement(int[] nums) {
        int i = 0;
        int max = nums[0];
        while (i < nums.length) {
            int cnt = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] == max) {
                    cnt++;
                } else {
                    cnt--;
                }
                if (cnt == -1) {
                    max = nums[j];
                    i = j;
                    break;
                }
                if (j == nums.length - 1) {
                    i = nums.length;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
        MajorityElement169 majorityElement169 = new MajorityElement169();
        int res = majorityElement169.majorityElement(nums);
        System.out.println(res);
    }
}
