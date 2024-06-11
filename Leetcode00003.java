/**
 * 3. Longest Substring Without Repeating Characters
 *
 * @link https://leetcode.com/problems/longest-substring-without-repeating-characters
 * @author vutiendat3601
 * @date 2024-06-06
 */
public class Leetcode00003 {
  public int lengthOfLongestSubstring(String s) {
    final int[] charIdxs = new int[128];
    int maxLength = 0;
    for (int i = 0; i < charIdxs.length; i++) {
      charIdxs[i] = -1;
    }
    int begin = 0;
    for (int i = 0; i < s.length(); i++) {
      final char c = s.charAt(i);

      // If last index of current character is in range of substring [begin, i] then change the
      // begin to last index of current character + 1
      // => begin = max(charIdxs[c]+1, begin)
      begin = Math.max(charIdxs[c] + 1, begin);

      final int currentLength = i - begin + 1;
      maxLength = maxLength >= currentLength ? maxLength : currentLength;

      // Use charIdxs to store the last index of current character in the string
      charIdxs[c] = i;
    }
    return maxLength;
  }

  public static void main(String[] args) {
    final String s = "abcabcbb";

    final Leetcode00003 leetcode00003 = new Leetcode00003();
    final int maxLength = leetcode00003.lengthOfLongestSubstring(s);
    System.out.println("maxLength: " + maxLength);
  }
}
