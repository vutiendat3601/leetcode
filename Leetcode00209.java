import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 209. Minimum Size Subarray Sum
 *
 * @link https://leetcode.com/problems/minimum-size-subarray-sum
 * @author vutiendat3601
 * @date 2024-06-25
 */
public class Leetcode00209 {
  public int minSubArrayLen(int target, int[] nums) {
    final int n = nums.length;
    int begin = 0;
    int end = 0;
    int sum = 0;
    int result = Integer.MAX_VALUE;
    while (end < n) {
      sum += nums[end];
      while (sum >= target) {
        result = result <= end - begin + 1 ? result : end - begin + 1;
        sum -= nums[begin];
        begin++;
      }
      end++;
    }
    return result <= 100_000 ? result : 0;
  }

  public static void main(String[] args) throws FileNotFoundException {
    final Scanner scanner = new Scanner(new FileInputStream("./resources/Leetcode00209.txt"));
    final int target = scanner.nextInt();
    scanner.nextLine();
    final String rawNums = scanner.nextLine();
    final String[] tokens = rawNums.split(" ");
    scanner.close();
    final int[] nums = new int[tokens.length];
    for (int i = 0; i < nums.length; i++) {
      nums[i] = Integer.valueOf(tokens[i]);
    }
    // final int[] nums = {2, 3, 1, 2, 4, 3};
    final Leetcode00209 leetcode00209 = new Leetcode00209();
    final int result = leetcode00209.minSubArrayLen(target, nums);
    System.out.println("result: " + result);
  }
}
