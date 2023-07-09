package tech.datvu.leetcode;

public class Leetcode_00002AddTwoNumbers {

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2, int carry, ListNode res) {
		int leftVal = l1 == null ? 0 : l1.val;
		int rightVal = l2 == null ? 0 : l2.val;
		int sum = leftVal + rightVal;
		sum += carry;
		carry = sum > 9 ? 1 : 0;
		res.val = sum % 10;
		if (l1 != null && l2 != null) {
			if (l1.next != null && l2.next != null) {
				res.next = new ListNode();
				addTwoNumbers(l1.next, l2.next, carry, res.next);
			} else if (l1.next != null && l2.next == null) {
				res.next = new ListNode();
				addTwoNumbers(l1.next, new ListNode(0), carry, res.next);
			} else if (l1.next == null && l2.next != null) {
				res.next = new ListNode();
				addTwoNumbers(new ListNode(0), l2.next, carry, res.next);
			} else if (carry > 0) {
				res.next = new ListNode();
				addTwoNumbers(null, null, carry, res.next);
			}
		} else if (carry > 0) {
			res.next = new ListNode();
			addTwoNumbers(null, null, carry, res.next);
		}
		return res;
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode res = addTwoNumbers(l1, l2, 0, new ListNode());
		return res;
	}

	public static void main(String[] args) {
		ListNode h1 = ListNode.createFromArray(new int[] { 9, 9, 9, 9, 9, 9, 9 });
		ListNode h2 = ListNode.createFromArray(new int[] { 9, 9, 9, 9 });

		ListNode res = addTwoNumbers(h1, h2);
		ListNode.traverList(res);
		System.out.println();
	}

}