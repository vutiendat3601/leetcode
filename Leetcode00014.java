/**
 * 14. Longest Common Prefix
 *
 * @link https://leetcode.com/problems/longest-common-prefix
 * @author vutiendat3601
 * @date 2024-06-20
 */
public class Leetcode00014 {
  public String longestCommonPrefix(String[] strs) {
    String prefix = strs[0];
    for (int i = 1; i < strs.length; i++) {
      while (strs[i].indexOf(prefix) != 0) {
        prefix = prefix.substring(0, prefix.length() - 1);
      }
    }
    return prefix;
  }

  public static void main(String[] args) {
    final String[] strs = {"flower", "flow", "flight"};

    final Leetcode00014 leetcode00014 = new Leetcode00014();
    final String longestCommonPrefix = leetcode00014.longestCommonPrefix(strs);
    System.out.println("longestCommonPrefix: " + longestCommonPrefix);
  }
}
