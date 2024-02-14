package tech.datvu.leetcode.general;

public class Leetcode_00876MiddleoftheLinkedList {

   public static ListNode middleNode(ListNode head) {
      ListNode sl = head;
      ListNode fs = head;
      while (fs != null && fs.next != null) {
         sl = sl.next;
         fs = fs.next.next;
      }
      return sl;
   }

   public static void main(String[] args) {
      ListNode sixth = new ListNode(6);
      ListNode fifth = new ListNode(5, sixth);
      ListNode fourth = new ListNode(4, fifth);
      ListNode third = new ListNode(3, fourth);
      ListNode second = new ListNode(2, third);
      ListNode head = new ListNode(1, second);
      ListNode res = middleNode(head);
      System.out.println(res.val);
   }
}
