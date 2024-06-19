import java.util.HashMap;
import java.util.Map;

/**
 * 12. Integer to Roman
 *
 * @link https://leetcode.com/problems/integer-to-roman
 * @author vutiendat3601
 * @date 2024-06-19
 */
public class Leetcode00012 {
  private static final Map<Integer, String> ROMANS = new HashMap<>();

  static {
    ROMANS.put(1, "I");
    ROMANS.put(4, "IV");
    ROMANS.put(5, "V");
    ROMANS.put(9, "IX");
    ROMANS.put(10, "X");
    ROMANS.put(40, "XL");
    ROMANS.put(50, "L");
    ROMANS.put(90, "XC");
    ROMANS.put(100, "C");
    ROMANS.put(400, "CD");
    ROMANS.put(500, "D");
    ROMANS.put(900, "CM");
    ROMANS.put(1000, "M");
  }

  public String intToRoman(int num) {
    final StringBuilder result = new StringBuilder();
    while (num > 0) {
      if (num >= 1000) {
        result.append(ROMANS.get(1000));
        num -= 1000;
      } else if (num >= 900) {
        result.append(ROMANS.get(900));
        num -= 900;
      } else if (num >= 500) {
        result.append(ROMANS.get(500));
        num -= 500;
      } else if (num >= 400) {
        result.append(ROMANS.get(400));
        num -= 400;
      } else if (num >= 100) {
        result.append(ROMANS.get(100));
        num -= 100;
      } else if (num >= 90) {
        result.append(ROMANS.get(90));
        num -= 90;
      } else if (num >= 50) {
        result.append(ROMANS.get(50));
        num -= 50;
      } else if (num >= 40) {
        result.append(ROMANS.get(40));
        num -= 40;
      } else if (num >= 10) {
        result.append(ROMANS.get(10));
        num -= 10;
      } else if (num >= 9) {
        result.append(ROMANS.get(9));
        num -= 9;
      } else if (num >= 5) {
        result.append(ROMANS.get(5));
        num -= 5;
      } else if (num >= 4) {
        result.append(ROMANS.get(4));
        num -= 4;
      } else if (num >= 1) {
        result.append(ROMANS.get(1));
        num -= 1;
      }
    }
    return result.toString();
  }

  public static void main(String[] args) {
    final int num = 3749;

    final Leetcode00012 leetcode00012 = new Leetcode00012();
    final String intToRoman = leetcode00012.intToRoman(num);
    System.out.println("intToRoman: " + intToRoman);
  }
}
