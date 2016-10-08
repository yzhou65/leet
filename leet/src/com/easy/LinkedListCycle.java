package com.easy;

/**
 * Given a linked list, determine if it has a cycle in it. Follow up: Can you solve it without using extra space?
 * @author Yue
 *
 */
public class LinkedListCycle {

	public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
			return false;
		}
        
        ListNode fast, slow;
        fast = head.next;
        slow = head;
        while (fast != slow) {
			if (fast == null || fast.next == null) {
				return false;
			}
			fast = fast.next.next;
			slow = slow.next;
		}
        return true;
    }

	private class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}
}
