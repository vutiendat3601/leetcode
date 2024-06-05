/**
 * 2. Add Two Numbers
 *
 * @link https://leetcode.com/problems/add-two-numbers
 * @author vutiendat3601
 * @date 2024-06-06
 */
public class Leetcode00002 {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    // Calculate the first nodes
    final ListNode result = new ListNode((l1.val + l2.val) % 10);
    int carry = l1.val + l2.val >= 10 ? 1 : 0;
    ListNode head = result;
    l1 = l1.next;
    l2 = l2.next;

    // While two lists not reach to after the end node
    while (l1 != null && l2 != null) {
      head.next = new ListNode((l1.val + l2.val + carry) % 10);
      carry = (l1.val + l2.val + carry) >= 10 ? 1 : 0;
      head = head.next;
      l1 = l1.next;
      l2 = l2.next;
    }

    // While the first list not reach to after the end node
    while (l1 != null) {
      head.next = new ListNode((l1.val + carry) % 10);
      carry = (l1.val + carry) >= 10 ? 1 : 0;
      head = head.next;
      l1 = l1.next;
    }

    // While the second list not reach to after the end node
    while (l2 != null) {
      head.next = new ListNode((l2.val + carry) % 10);
      carry = (l2.val + carry) >= 10 ? 1 : 0;
      head = head.next;
      l2 = l2.next;
    }

    if (carry > 0) {
      head.next = new ListNode(1);
    }
    return result;
  }

  public static void main(String[] args) {
    final ListNode l1 = ListNode.from(2, 4, 9);
    final ListNode l2 = ListNode.from(5, 6, 4, 9);

    final Leetcode00002 leetcode00002 = new Leetcode00002();
    final ListNode result = leetcode00002.addTwoNumbers(l1, l2);
    ListNode.print(result);
  }
}

class ListNode {
  int val;
  ListNode next;

  ListNode() {}

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  @Override
  public String toString() {
    return String.valueOf(val);
  }

  static ListNode from(int... nums) {
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

  static void print(ListNode head) {
    if (head != null) {
      while (head.next != null) {
        System.out.print(head.val + "->");
        head = head.next;
      }
      System.out.println(head.val);
    }
  }
}
