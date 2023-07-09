package tech.datvu.leetcode;

public class Leetcode_01710MaximumUnitsonaTruck {
    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        qSort(boxTypes, 0, boxTypes.length - 1);
        int res = 0;
        int cnt = 0;
        for (int i = 0; i < boxTypes.length; i++) {
            if (cnt + boxTypes[i][0] < truckSize) {
                cnt += boxTypes[i][0];
                res += boxTypes[i][0] * boxTypes[i][1];
            } else {
                res += (truckSize - cnt) * boxTypes[i][1];
                break;
            }
        }
        return res;
    }

    public static void qSort(int[][] nums, int l, int r) {
        if (l < r) {
            int piv = r;
            int i = l - 1;
            for (int j = l; j < r; j++) {
                if (nums[j][1] > nums[piv][1]) {
                    i++;
                    for (int k = 0; k <= 1; k++) {
                        int tmp = nums[j][k];
                        nums[j][k] = nums[i][k];
                        nums[i][k] = tmp;
                    }
                }
            }
            i++;
            for (int k = 0; k <= 1; k++) {
                int tmp = nums[i][k];
                nums[i][k] = nums[piv][k];
                nums[piv][k] = tmp;
            }
            qSort(nums, l, i - 1);
            qSort(nums, i + 1, r);
        }
    }

    public static void main(String[] args) {
        int[][] boxTypes = { { 5, 10 }, { 2, 5 }, { 4, 7 }, { 3, 9 } };
        int truckSize = 10;
        int res = maximumUnits(boxTypes, truckSize);
        System.out.println(res);
    }
}
