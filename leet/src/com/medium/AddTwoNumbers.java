package com.medium;

public class AddTwoNumbers {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(7);
		l2.next.next.next = new ListNode(9);
		
		ListNode l3 = addTwoNumbers(l1, l2);
		ListNode head = l3;
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
		if (l1 == null && l2 == null) {
			return null;
		}
		
		ListNode head = new ListNode(0);
		ListNode cur = head;
		int carry = 0;
		
		while (l1 != null && l2 != null) {
			int sum = l1.val + l2.val + carry;
			carry = sum / 10;
			cur.next = new ListNode(sum % 10);
			cur = cur.next;
			l1 = l1.next;
			l2 = l2.next;
		}
		
		while (l1 != null) {
			int sum = l1.val + carry;
			carry = sum / 10;
			cur.next = new ListNode(sum % 10);
			l1 = l1.next;
			cur = cur.next;
		}
		
		while (l2 != null) {
			int sum = l2.val + carry;
			carry = sum / 10;
			cur.next = new ListNode(sum % 10);
			l2 = l2.next;
			cur = cur.next;
		}
		
		if (carry != 0) {
			cur.next = new ListNode(carry);
		}
		
		return head.next;
	}
	
}


class ListNode {
	int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
