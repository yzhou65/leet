package com.medium;

public class SortedArrayToBST {

	public TreeNode sortedArrayToBST(int[] nums) {
		if (nums == null) {
			return null;
		}
		
		return buildTree(nums, 0, nums.length - 1);
    }
	
	private TreeNode buildTree(int[] nums, int start, int end) {
		if (start > end) {
			return null;
		}
		
		int mid = (start + end) / 2;
		TreeNode node = new TreeNode(nums[mid]);
		node.left = buildTree(nums, start, mid - 1);
		node.right = buildTree(nums, mid + 1, end);
		
		return node;
	}
	
	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
}

