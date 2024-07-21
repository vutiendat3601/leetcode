/**
 * 21. Merge Two Sorted Lists
 *
 * @link https://leetcode.com/problems/merge-two-sorted-lists
 * @author vutiendat3601
 * @date 2024-07-22
 */public class Leetcode00021 {
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    final ListNode result = new ListNode();
    ListNode temp = result;
    while (list1 != null && list2 != null) {
      if (list1.val <= list2.val) {
        temp.next = list1;
        list1 = list1.next;
      } else {
        temp.next = list2;
        list2 = list2.next;
      }
      temp = temp.next;
    }
    while (list1 != null) {
      temp.next = list1;
      list1 = list1.next;
      temp = temp.next;
    }
    while (list2 != null) {
      temp.next = list2;
      list2 = list2.next;
      temp = temp.next;
    }
    return result.next;
  }
  
  public static void main(String[] args) {
    final ListNode list1 = ListNode.from(1,2,4);
    final ListNode list2 = ListNode.from(1,3,4);
    
    final Leetcode00021 leetcode00021 = new Leetcode00021();
    final ListNode result = leetcode00021.mergeTwoLists(list1, list2);
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
