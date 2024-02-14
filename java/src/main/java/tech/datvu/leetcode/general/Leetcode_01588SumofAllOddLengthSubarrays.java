package tech.datvu.leetcode.general;

public class Leetcode_01588SumofAllOddLengthSubarrays {

    public static int sumOddLengthSubarrays(int[] arr) {
        int res = 0;
        for (int i = 1; i <= arr.length; i += 2) {
            int sum = 0;
            for (int j = 0; j < i; j++) {
                sum += arr[j];
            }
            res += sum;
            for (int k = i; k < arr.length; k++) {
                sum -= arr[k - i];
                sum += arr[k];
                res += sum;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2 };
        int res = sumOddLengthSubarrays(arr);
        System.out.println(res);
    }
}
