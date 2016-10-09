package com.easy;

/**
 * Given a linked list, remove the nth node from the end of list and return its head
 * @author yue
 *
 */
public class RemoveNthNodeFromEndOfList {
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
        if (n <= 0) {
			return null;
		}
        ListNode prehead = new ListNode(0);
        prehead.next = head;
        ListNode cur = prehead;
        for (int i = 0; i < n; i++) {
			if (head == null) {
				return null;
			}
			head = head.next;
		}
        while (head != null) {
			head = head.next;
			cur = cur.next;
		}
        cur.next = cur.next.next;
        
        return prehead.next;
    }
	
	// Definition for singly-linked list.
	private class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

}
