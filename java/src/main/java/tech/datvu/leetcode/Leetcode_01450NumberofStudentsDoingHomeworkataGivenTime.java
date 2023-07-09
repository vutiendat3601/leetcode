package tech.datvu.leetcode;

public class Leetcode_01450NumberofStudentsDoingHomeworkataGivenTime {

    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int res = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && queryTime <= endTime[i]) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] startTime = { 1, 2, 3 };
        int[] endTime = { 3, 2, 7 };
        int queryTime = 4;
        int res = busyStudent(startTime, endTime, queryTime);
        System.out.println(res);
    }
}
