package com.medium;

import java.util.Stack;

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */
public class BSTIterator {

	Stack<TreeNode> stack = new Stack<TreeNode>();
	TreeNode current;
	
	public BSTIterator(TreeNode root) {
        while (!stack.isEmpty()) {
			stack.pop();
		}
        current = root;
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        
    	return (current != null || !stack.isEmpty());
    }

    /** @return the next smallest number */
    public int next() {
        while (current != null){
        	stack.push(current);
        	current = current.left;
        }
        current = stack.pop();
        int val = current.val;
        current = current.right;
    	return val;
    }
    
    
    private class TreeNode {
    	int val;
    	TreeNode left;
    	TreeNode right;     
    	TreeNode(int x) { val = x; }
    }
}

