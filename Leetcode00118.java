import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 118. Pascal's Triangle
 *
 * @link https://leetcode.com/problems/pascals-triangle
 * @author vutiendat3601
 * @date 2024-07-06
 */
public class Leetcode00118 {
  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> result = new LinkedList<>();
    result.add(List.of(1));
    int row = 2;
    while (row <= numRows) {
      Integer[] nums = new Integer[row];
      nums[0] = 1;
      nums[row - 1] = 1;
      List<Integer> preRow = result.get(row - 2);
      int n = preRow.size();
      for (int i = 1; i <= (row - 1) / 2; i++) {
        nums[i] = preRow.get(i - 1) + preRow.get(i);
        nums[row - 1 - i] = preRow.get(n - 1 - i) + preRow.get(n - i);
      }
      result.add(Arrays.asList(nums));
      row++;
    }

    return result;
  }

  public static void main(String[] args) {
    final int numRows = 10;

    final Leetcode00118 leetcode00118 = new Leetcode00118();
    final List<List<Integer>> result = leetcode00118.generate(numRows);
    result.forEach(System.out::println);
  }
}
