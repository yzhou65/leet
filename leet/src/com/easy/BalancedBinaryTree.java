package com.easy;

/**
 * Given a binary tree, determine if it is height-balanced.
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the
 * depth of the two subtrees of every node never differ by more than 1.
 * @author yue
 *
 */
public class BalancedBinaryTree {

	public class Solution {
	    public boolean isBalanced(TreeNode root) {
	        return maxDepth(root) != -1;
	    }
	    
	    public int maxDepth(TreeNode root) {
	    	if (root == null) {
				return 0;
			}
	    	
	    	int left = maxDepth(root.left);
	    	int right = maxDepth(root.right);
	    	if (left == -1 || right == -1 || Math.abs(left - right) > 1) {
				return -1;
			}
	    	return Math.max(left, right) + 1;
	    }
	    
	    /**
	     * Definition for a binary tree node.
	     */
	    private class TreeNode {
	    	int val;
	    	TreeNode left;
	    	TreeNode right;
	    	TreeNode(int x) { 
	    		val = x; 
	    	}
	    }
	}
	
}
