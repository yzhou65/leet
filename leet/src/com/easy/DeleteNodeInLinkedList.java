package com.easy;

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
