package tech.datvu.leetcode.top150.arraystring;

public class MajorityElement169 {

    public int majorityElement(int[] nums) {
        int mostOccurence = nums[0];
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (mostOccurence == nums[i]) {
                cnt++;
            } else if (cnt == 0) {
                cnt++;
                mostOccurence = nums[i];
            } else {
                cnt--;
            }
        }
        return mostOccurence;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 1, 1, 2 };
        MajorityElement169 majorityElement169 = new MajorityElement169();
        int res = majorityElement169.majorityElement(nums);
        System.out.println(res);
    }
}
