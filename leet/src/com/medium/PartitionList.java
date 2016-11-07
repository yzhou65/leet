package com.medium;

/**
 * Given a linked list and a value x, partition it such that all nodes less than x come 
 * before nodes greater than or equal to x.
You should preserve the original relative order of the nodes in each of the two partitions.
For example,
Given 1->4->3->2->5->2 and x = 3,
return 1->2->2->4->3->5.
 * @author Yue
 *
 */
public class PartitionList {
	public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) {
			return head;
		}
        ListNode smallDummy = new ListNode(0);
        ListNode bigDummy = new ListNode(0);
        ListNode small = smallDummy;
        ListNode big = bigDummy;
        
        while (head != null) {
			if (head.val < x) {
				small.next = head;
				small = head;
			} else {
				big.next = head;
				big = head;
			}
			head = head.next;
		}
        
        big.next = null;
        small.next = bigDummy.next;
        return smallDummy.next;
    }

	private class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
		}
	}
}
