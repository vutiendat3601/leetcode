package tech.datvu.leetcode;

import java.util.Arrays;

public class Leetocde_00645SetMismatch {

    public static int[] findErrorNums(int[] nums) {
        int[] temp = new int[nums.length+1];
        int[] res = new int[2];
        for(int n:nums){
            temp[n]+=n;
        }
        for(int i=1; i<temp.length; i++){
            if(temp[i] == 0) res[1]=i;
            if(temp[i] != i && temp[i] !=0) res[0]=i;
            
        }
       return res;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1 };
        int[] res = findErrorNums(nums);
        System.out.println(Arrays.toString(res));
    }
}
