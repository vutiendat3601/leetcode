/**
 * 275. H-Index II
 *
 * @link https://leetcode.com/problems/h-index-ii
 * @author vutiendat3601
 * @date 2024-06-27
 */
public class Leetcode00275 {
  public int hIndex(int[] citations) {
    final int n = citations.length;
    int begin = 0;
    int end = n - 1;
    int h = 0;
    while (begin <= end) {
      final int mid = (begin + end) / 2;
      final int numOfItems = n - mid;
      final int potentiallH = Math.min(numOfItems, citations[mid]);
      h = Math.max(h, potentiallH);
      if (citations[mid] < numOfItems) {
        begin = mid + 1;
      } else if (citations[mid] > numOfItems) {
        end = mid - 1;
      } else {
        return h;
      }
    }
    return h;
  }

  public static void main(String[] args) {
    final int[] citations = {0, 0, 4, 4};

    final Leetcode00275 leetcode00275 = new Leetcode00275();
    final int hIndex = leetcode00275.hIndex(citations);
    System.out.println("hIndex: " + hIndex);
  }
}
