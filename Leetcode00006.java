/**
 * 6. Zigzag Conversion
 *
 * @link https://leetcode.com/problems/zigzag-conversion
 * @author vutiendat3601
 * @date 2024-06-11
 */
public class Leetcode00006 {
  public String convert(String s, int numRows) {
    final int n = s.length();
    if (n <= numRows || numRows <= 1) {
      return s;
    }
    final char[] zigzag = new char[n];
    int idx = 0;
    // Even step
    final int step = 2 * numRows - 2;

    // First row
    for (int i = 0; i < n; i += step) {
      zigzag[idx++] = s.charAt(i);
    }

    // Row [2, n-1]
    for (int i = 1; i < numRows - 1; i++) {
      zigzag[idx++] = s.charAt(i);
      int j = i + step;
      while (j < n) {
        // Append if the interleaved position, interleaved position = currentIndex - 2 * currentRow
        zigzag[idx++] = s.charAt(j - 2 * i);
        // Append if the even position
        zigzag[idx++] = s.charAt(j);
        j += step;
      }
      // Append if the interleaved position available
      if (j - 2 * i < n) {
        zigzag[idx++] = s.charAt(j - 2 * i);
      }
    }

    // Last row
    for (int i = numRows - 1; i < n; i += step) {
      zigzag[idx++] = s.charAt(i);
    }
    return new String(zigzag);
  }

  public static void main(String[] args) {
    final String s = "AB";
    final int numRows = 1;
    final Leetcode00006 leetcode00006 = new Leetcode00006();
    final String zigzag = leetcode00006.convert(s, numRows);
    System.out.println("zigzag: " + zigzag);
  }
}
