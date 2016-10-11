package com.medium;

/**
 * Given a linked list, swap every two adjacent nodes and return its head.
For example,
Given 1->2->3->4, you should return the list as 2->1->4->3.

Your algorithm should use only constant space. You may not modify the values in the list, 
only nodes itself can be changed.
 * @author yue
 */
public class SwapNodesInPairs {
	
        
	public ListNode swapPairs(ListNode head) {
        ListNode prehead = new ListNode(0);
        prehead.next = head;
        head = prehead;
        
        while (head.next != null && head.next.next != null) {
			ListNode n1 = head.next;
			ListNode n2 = head.next.next;
			
			head.next = n2;
			n1.next = n2.next;
			n2.next = n1;
			
			// move forward to the next pair
			head = n1;
		}
		return prehead.next;
    }

	private class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
	 
}
