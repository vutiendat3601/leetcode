import java.util.Arrays;

/**
 * 661. Image Smoother
 *
 * @link https://leetcode.com/problems/image-smoother
 * @author vutiendat3601
 * @date 2024-07-18
 */
public class Leetcode00661 {
  public int[][] imageSmoother(int[][] img) {
    final int m = img.length;
    final int n = img[0].length;
    final int[][] prefixSum = new int[m][n];
    final int[][] result = new int[m][n];
    for (int i = 0; i < m; i++) {
      prefixSum[i][0] = img[i][0];
      for (int j = 1; j < n; j++) {
        prefixSum[i][j] = prefixSum[i][j - 1] + img[i][j];
      }
    }
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        result[i][j] = avg(prefixSum, m, n, i, j);
      }
    }
    return result;
  }

  private int avg(int[][] prefixSum, int m, int n, int i, int j) {
    if (n == 1 && m == 1) {
      return prefixSum[0][0];
    }
    int numOfRows = 3;
    int numOfCols = 3;
    if (i - 1 < 0) {
      numOfRows--;
    }
    if (i + 1 == m) {
      numOfRows--;
    }
    if (j - 1 < 0) {
      numOfCols--;
    }
    if (j + 1 == n) {
      numOfCols--;
    }
    int numOfCells = numOfRows * numOfCols;
    int bRow = Math.max(i - 1, 0);
    int eRow = Math.min(m - 1, i + 1);
    int bCol = Math.max(j - 1, 0);
    int eCol = Math.min(n - 1, j + 1);
    int sum = getSum(prefixSum, bRow, eRow, bCol, eCol);
    return sum / numOfCells;
  }

  private int getSum(int[][] prefixSum, int bRow, int eRow, int bCol, int eCol) {
    int sum = 0;
    if (bCol > 0) {
      for (int i = bRow; i <= eRow; i++) {
        sum += prefixSum[i][eCol] - prefixSum[i][bCol - 1];
      }
    } else {
      for (int i = bRow; i <= eRow; i++) {
        sum += prefixSum[i][eCol];
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    final int[][] img = {{2, 3, 4}, {5, 6, 7}, {11, 12, 13}, {14, 15, 16}};

    final Leetcode00661 leetcode00661 = new Leetcode00661();
    final int[][] result = leetcode00661.imageSmoother(img);
    for (int[] row : result) {
      System.out.println(Arrays.toString(row));
    }
  }
}
