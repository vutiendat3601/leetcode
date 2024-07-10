import java.util.LinkedList;
import java.util.List;

/**
 * 51. N-Queens
 *
 * @link https://leetcode.com/problems/n-queens
 * @author vutiendat3601
 * @date 2024-07-10
 */
public class Leetcode00051 {
  private int[] queens;
  private int n;
  private List<List<String>> result;

  public List<List<String>> solveNQueens(int n) {
    this.n = n;
    queens = new int[n];
    result = new LinkedList<>();
    put(0);
    return result;
  }

  public void put(int row) {
    if (row == n) {
      final List<String> newResult = new LinkedList<>();
      for (int pos : queens) {
        String resultStr = "";
        for (int i = 0; i < n; i++) {

          if (i == pos) {
            resultStr += "Q";
          } else {
            resultStr += ".";
          }
        }
        newResult.add(resultStr);
      }
      result.add(newResult);
    }
    for (int col = 0; col < n; col++) {
      int lastRow = row - 1;
      boolean available = true;
      while (lastRow >= 0) {
        if (queens[lastRow] == col || Math.abs(col - queens[lastRow]) == row - lastRow) {
          available = false;
          break;
        }
        lastRow--;
      }
      if (available) {
        queens[row] = col;
        put(row + 1);
        queens[row] = 0;
      }
    }
  }

  public static void main(String[] args) {
    final int n = 4;

    final Leetcode00051 leetcode00051 = new Leetcode00051();
    final List<List<String>> result = leetcode00051.solveNQueens(n);
    result.forEach(System.out::println);
  }
}
