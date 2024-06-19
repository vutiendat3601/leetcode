public class Leetcode00011 {
  public int maxArea(int[] height) {
    int begin = 0;
    int end = height.length - 1;
    int maxArea = 0;
    while (begin < end) {
      maxArea = Math.max(maxArea, Math.min(height[begin], height[end]) * (end - begin));
      if (height[begin] < height[end]) {
        begin++;
      } else {
        end--;
      }
    }
    return maxArea;
  }

  public static void main(String[] args) {
    final int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

    final Leetcode00011 leetcode00011 = new Leetcode00011();
    final int maxArea = leetcode00011.maxArea(height);
    System.out.println("maxArea: " + maxArea);
  }
}
