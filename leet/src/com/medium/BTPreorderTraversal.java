package com.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class BTPreorderTraversal {

	public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> preorder = new ArrayList<Integer>();
        
        if (root == null) {
			return preorder;
		}
        
        stack.push(root);
        while (!stack.empty()) {
			TreeNode node = stack.pop();
			preorder.add(node.val);
			if (node.right != null) {
				stack.push(node.right);
			}
			if (node.left != null) {
				stack.push(node.left);
			}
		}
		return preorder;
    }
	
	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
}
