import java.util.LinkedList;
import java.util.List;

/**
 * 89. Gray Code
 *
 * @link https://leetcode.com/problems/gray-code
 * @author vutiendat3601
 * @date 2025-06-06
 */

public class Leetcode00089 {
    public List<Integer> grayCode(int n) {
        final List<Integer> result = new LinkedList<>();
        for (int i = 0; i < (1 << n); i++) {
            result.add(i ^ (i >> 1));
        }
        return result;
    }

    public static void main(String[] args) {
    final int n = 4;

    final Leetcode00089 leetcode00089 = new Leetcode00089();
    final List<Integer> grayCodes = leetcode00089.grayCode(n);
    System.out.println(grayCodes);
  }
}