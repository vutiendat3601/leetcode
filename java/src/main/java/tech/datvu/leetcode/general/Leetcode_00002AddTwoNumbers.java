package tech.datvu.leetcode.general;

import tech.datvu.leetcode.shared.global.ListNode;

public class Leetcode_00002AddTwoNumbers {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = new ListNode(0);
		ListNode tmpNode = result;
		int carry = 0;
		while (l1 != null && l2 != null) {
			int sum = l1.val + l2.val + carry;
			carry = sum >= 10 ? 1 : 0;
			sum = sum % 10;
			tmpNode.val = sum;
			tmpNode.next = new ListNode(0);
			tmpNode = tmpNode.next;
			l1 = l1.next;
			l2 = l2.next;
		}
		while (l1 != null) {
			int sum = l1.val + carry;
			carry = sum >= 10 ? 1 : 0;
			sum = sum % 10;
			tmpNode.val = sum;
			tmpNode.next = new ListNode(sum);
			tmpNode = tmpNode.next;
			l1 = l1.next;
		}
		while (l2 != null) {
			int sum = l2.val + carry;
			carry = sum >= 10 ? 1 : 0;
			sum = sum % 10;
			tmpNode.next = new ListNode(sum);
			tmpNode = tmpNode.next;
			l2 = l2.next;
		}
		if (carry > 0) {
			tmpNode.next = new ListNode(carry);
		}
		return result.next;
	}

	public static void main(String[] args) {
		// ## Test case 1
		ListNode h1 = ListNode.createFromArray(new int[] { 2, 4, 3 });
		ListNode h2 = ListNode.createFromArray(new int[] { 5, 6, 4 });

		// ## Test case 2
		// h1 = ListNode.createFromArray(new int[] { 0 });
		// h2 = ListNode.createFromArray(new int[] { 0 });

		// ## Test case 3
		h1 = ListNode.createFromArray(new int[] { 9, 9, 9, 9, 9, 9, 9 });
		h2 = ListNode.createFromArray(new int[] { 9, 9, 9, 9 });
		ListNode res = addTwoNumbers(h1, h2);
		ListNode.traverList(res);
		System.out.println();
	}

}