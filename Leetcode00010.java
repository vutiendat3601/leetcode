/**
 * 10. Regular Expression Matching
 *
 * @link https://leetcode.com/problems/regular-expression-matching
 * @author vutiendat3601
 * @date 2024-06-14
 */
public class Leetcode00010 {
  public boolean isMatch(String s, String p) {
    final int n = s.length();
    final int m = p.length();
    final boolean[][] matches = new boolean[n + 1][m + 1];
    matches[0][0] = true;
    for (int c = 1; c <= m; c++) {
      if (p.charAt(c - 1) == '*') {
        matches[0][c] = matches[0][c - 2];
      }
    }
    for (int r = 1; r <= n; r++) {
      for (int c = 1; c <= m; c++) {
        final char sChar = s.charAt(r - 1);
        final char pChar = p.charAt(c - 1);
        if (pChar == '.' || sChar == pChar) {
          matches[r][c] = matches[r - 1][c - 1];
        } else if (pChar == '*') {
          matches[r][c] =
              matches[r][c - 2]
                  || (matches[r - 1][c] && (p.charAt(c - 2) == '.' || sChar == p.charAt(c - 2)));
        }
      }
    }
    return matches[n][m];
  }

  public static void main(String[] args) {
    final String s = "aa";
    final String p = "a*";

    // final String s = "aa";
    // final String p = "a";

    final Leetcode00010 leetcode00010 = new Leetcode00010();
    final boolean isMatch = leetcode00010.isMatch(s, p);
    System.out.println("isMatch: " + isMatch);
  }
}
