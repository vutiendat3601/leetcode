import java.util.Arrays;

/**
 * 1160. Find Words That Can Be Formed by Characters
 *
 * @link https://leetcode.com/problems/find-words-that-can-be-formed-by-characters
 * @author vutiendat3601
 * @date 2024-07-02
 */
public class Leetcode01160 {
  public int countCharacters(String[] words, String chars) {
    final StringBuilder result = new StringBuilder();
    final int[] charCnts = new int[1000];
    for (char c : chars.toCharArray()) {
      charCnts[c]++;
    }
    for (String str : words) {
      final int[] tmpCnts = Arrays.copyOf(charCnts, charCnts.length);
      boolean isFormed = true;
      for (char c : str.toCharArray()) {
        if (tmpCnts[c] > 0) {
          tmpCnts[c]--;
        } else {
          isFormed = false;
          break;
        }
      }
      if (isFormed) {
        result.append(str);
      }
    }
    return result.length();
  }

  public static void main(String[] args) {
    final String[] words = {"cat", "bt", "hat", "tree"};
    final String chars = "atach";

    final Leetcode01160 leetcode01160 = new Leetcode01160();
    final int cnt = leetcode01160.countCharacters(words, chars);
    System.out.println("cnt: " + cnt);
  }
}
