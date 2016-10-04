package com.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BTZigzagLevelOrderTraversal {

	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();    
		
	    if (root == null) {
			return result;
		}
	    
	    Stack<TreeNode> currLevel = new Stack<>();
	    Stack<TreeNode> nextLevel = new Stack<>();
	    Stack<TreeNode> tmp;
	    
	    currLevel.push(root);
	    boolean normalOrder = true;
	    
	    while (!currLevel.isEmpty()) {
			ArrayList<Integer> currLevelResult = new ArrayList<>();
			
			while (!currLevel.isEmpty()) {
				TreeNode node = currLevel.pop();
				currLevelResult.add(node.val);
				
				if (normalOrder) {
					if (node.left != null) {
						nextLevel.push(node.left);
					}
					if (node.right != null) {
						nextLevel.push(node.right);
						
					}
				} else {
					if (node.right != null) {
						nextLevel.push(node.right);
					}
					if (node.left != null) {
						nextLevel.push(node.left);
					}
				}
			}
			
			result.add(currLevelResult);
			tmp = currLevel;
			currLevel = nextLevel;
			nextLevel = tmp;
			normalOrder = !normalOrder;
		}
	    
		return result;
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