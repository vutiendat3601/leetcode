package tech.datvu.leetcode.general;

public class Leetcode_01437CheckIfAll1sAreatLeastLengthKPlacesAway {

    public static boolean kLengthApart(int[] nums, int k) {
        int count = 0;
        boolean flag = false;
      for (int i = 0; i < nums.length; i++) {
        if (nums[i] > 0) {
          if (flag && count < k && i !=0) {
            return false;
          } else {
            count = 0;
          }
          
          flag = true;
        } else {
          count++;
        }
        
      }
      
      return true;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 0, 0, 0, 1, 0, 0, 1 };
        int k = 2;
        boolean res = kLengthApart(nums, k);
        System.out.println(res);
    }
}
