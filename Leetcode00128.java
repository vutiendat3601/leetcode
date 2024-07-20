import java.util.PriorityQueue;

/**
 * 128. Longest Consecutive Sequence
 *
 * @link https://leetcode.com/problems/longest-consecutive-sequence
 * @author vutiendat3601
 * @date 2024-07-20
 */
public class Leetcode00128 {
  public int longestConsecutive(int[] nums) {
    final PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> -Integer.compare(x, y));
    for (int num : nums) {
      pq.add(num);
    }
    int result = 0;
    int cnt = 0;
    int lastNum = Integer.MAX_VALUE;
    while (!pq.isEmpty()) {
      final int num = pq.poll();
      if (num == lastNum - 1) {
        cnt++;
        lastNum = num;
      } else if (num != lastNum) {
        lastNum = num;
        result = Math.max(cnt, result);
        cnt = 1;
      }
    }
    return Math.max(cnt, result);
  }

  public static void main(String[] args) {
    final int[] nums = {1, 2, 0, 1};

    final Leetcode00128 leetcode00128 = new Leetcode00128();
    final int result = leetcode00128.longestConsecutive(nums);
    System.out.println("result: " + result);
  }
}
