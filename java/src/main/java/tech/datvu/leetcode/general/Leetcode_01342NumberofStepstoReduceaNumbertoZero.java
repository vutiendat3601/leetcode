package tech.datvu.leetcode.general;

public class Leetcode_01342NumberofStepstoReduceaNumbertoZero {
    public static int numberOfSteps(int num) {
        int cnt = 0;
        while (num != 0) {
            num=num%2==0 ? num/2 : num -1;
            cnt++;
        }
        return cnt;
    }
}
