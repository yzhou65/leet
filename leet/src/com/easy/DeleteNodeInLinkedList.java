package com.easy;

/**
 * Delete a node in a singly linked list, given only access to that node
 * @author yue
 *
 */
public class DeleteNodeInLinkedList {

	public void deleteNode(ListNode node) {
        ListNode temp = node.next;
        node.val = temp.val;
        node.next = temp.next;
        temp = null;
    } 
	
	private class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
}
