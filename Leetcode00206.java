/**
 * 206. Reverse Linked List
 *
 * @link https://leetcode.com/problems/reverse-linked-list
 * @author vutiendat3601
 * @date 2024-07-22
 */
public class Leetcode00206 {
  public ListNode reverseList(ListNode head) {
    return reverseLinkedList(head, null);
  }

  private ListNode reverseLinkedList(ListNode head, ListNode tail) {
    if (head == null) {
      return tail;
    }
    ListNode nextHead = head.next;
    head.next = tail;
    return reverseLinkedList(nextHead, head);
  }

  public static void main(String[] args) {
    final ListNode head = ListNode.from(1, 2, 3, 4);

    final Leetcode00206 leetcode00206 = new Leetcode00206();
    final ListNode result = leetcode00206.reverseList(head);
    ListNode.print(result);
  }

  static class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
      this.val = val;
    }

    public ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }

    @Override
    public String toString() {
      return String.valueOf(val);
    }

    public static ListNode from(int... nums) {
      final ListNode beforeHead = new ListNode();
      if (nums != null && nums.length > 0) {
        beforeHead.next = new ListNode(nums[0]);
        ListNode head = beforeHead.next;
        for (int i = 1; i < nums.length; i++) {
          head.next = new ListNode(nums[i]);
          head = head.next;
        }
      }
      return beforeHead.next;
    }

    public static void print(ListNode head) {
      if (head != null) {
        while (head.next != null) {
          System.out.print(head.val + "->");
          head = head.next;
        }
        System.out.println(head.val);
      }
    }
  }
}
