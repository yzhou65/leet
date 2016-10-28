package com.medium;

/**
 * Given a list, rotate the list to the right by k places, where k is non-negative.

For example:
Given 1->2->3->4->5->NULL and k = 2,
return 4->5->1->2->3->NULL
 * @author Yue
 *
 */
public class RotateList {

	public ListNode rotateRight(ListNode head, int k) {
		if (head == null) {
			return null;
		}
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode tail = head;
		
		int length = size(head);
		k = k % length;
		
		for (int i = 0; i < k; i++) {
			head = head.next;
		}
		
		while (head.next != null) {
			head = head.next;
			tail = tail.next;
		}
		head.next = dummy.next;
		dummy.next = tail.next;
		tail.next = null;
	
		return dummy.next;
    }
	
	private int size(ListNode head) {
		int length = 0;
		while (head != null) {
			length++;
			head = head.next;
		}
		return length;
	}
	
	private class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
