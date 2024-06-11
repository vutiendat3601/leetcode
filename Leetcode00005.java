public class Leetcode00005 {

  public String longestPalindrome(String s) {
    // Use Dynamic Programming
    final boolean[][] palindromes = new boolean[s.length()][s.length()];
    final int n = s.length();
    String maxPlindrome = "";

    // Validate palindrome by increase length of string: 0, 1, 2, 3, 4, 5, 6 ... n
    // To a string in range [a, b] is palindrome, It must be satisfied:
    // - The a and b index of string is the same character
    // - The shorter string [a+i, b-i] is palindrome
    for (int step = 0; step < n; step++) {
      for (int i = 0; i + step < n; i++) {
        palindromes[i][i + step] =
            s.charAt(i) == s.charAt(i + step)
                && ((i + 1 <= i + step - 1) ? palindromes[i + 1][i + step - 1] : true);
        String subString = "";
        if (palindromes[i][i + step]
            && (subString = s.substring(i, i + step + 1)).length() > maxPlindrome.length()) {
          maxPlindrome = subString;
        }
      }
    }
    return maxPlindrome;
  }

  public static void main(String[] args) {
    final String s = "babad";

    final Leetcode00005 leetcode00005 = new Leetcode00005();
    final String longestPalindrome = leetcode00005.longestPalindrome(s);
    System.out.println("longestPalindrome: " + longestPalindrome);
  }
}
