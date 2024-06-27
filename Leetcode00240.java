/**
 * 240. Search a 2D Matrix II
 *
 * @link https://leetcode.com/problems/search-a-2d-matrix-ii
 * @author vutiendat3601
 * @date 2024-06-27
 */
public class Leetcode00240 {
  public boolean searchMatrix(int[][] matrix, int target) {
    final int n = matrix.length;
    final int m = matrix[0].length;
    int row = 0;
    int col = m - 1;
    while (row < n && col >= 0) {
      if (matrix[row][col] == target) {
        return true;
      }
      if (matrix[row][col] > target) {
        col--;
      } else if (matrix[row][col] < target) {
        row++;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    final int[][] matrix = {
      {1, 4, 7, 11, 15},
      {2, 5, 8, 12, 19},
      {3, 6, 9, 16, 22},
      {10, 13, 14, 17, 24},
      {18, 21, 23, 26, 30}
    };
    final int target = 5;

    final Leetcode00240 leetcode00240 = new Leetcode00240();
    final boolean isFound = leetcode00240.searchMatrix(matrix, target);
    System.out.println("isFound: " + isFound);
  }
}
