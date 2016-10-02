package com.medium;

import org.omg.CORBA.Current;

public class SortedListToBST {
	private ListNode current;
	
	public TreeNode sortedListToBST(ListNode head) {
		int size = 0;
		current = head;
		size = getListSize(head);
		return sortedListToBSTHelper(size);
	}
	
	private int getListSize(ListNode head){
		int size = 0;
		
		while (head != null) {
			size ++;
			head = head.next;
		}
		return size;
	}
	
	private TreeNode sortedListToBSTHelper(int size){
		if (size <= 0) {
			return null;
		}
		
		TreeNode left = sortedListToBSTHelper(size / 2);
		TreeNode root = new TreeNode(current.val);
		current = current.next;
		TreeNode right = sortedListToBSTHelper(size - 1 - size / 2);
		
		root.left = left;
		root.right = right;
		
		return root;
	}

	
	private class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x;}
	}
	
	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x;}
	}
}
