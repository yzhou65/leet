package com.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.easy.BTLevelOrderTraversal.TreeNode;

public class BTLevelOrderTraversal2 {
	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	
	public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if (root == null) {
			return result;
		}
		
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		int currLevelNodeNum = 1;
		int nextLevelNodeNum = 0;
		
		while (currLevelNodeNum != 0) {
			ArrayList<Integer> level = new ArrayList<>();
			nextLevelNodeNum = 0;
			
			while (currLevelNodeNum != 0) {
				TreeNode node = queue.poll();
				currLevelNodeNum--;
				level.add(node.val);
				
				if (node.left != null) {
					queue.add(node.left);
					nextLevelNodeNum++;
				}
				if (node.right != null) {
					queue.add(node.right);
					nextLevelNodeNum++;
				}
			}
			
			result.add(0, level);
			currLevelNodeNum = nextLevelNodeNum;
		}
		return result;
	}
	
	/*
	public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if (root == null) {
			return result;
		}
		
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			ArrayList<Integer> level = new ArrayList<>();
			int size = queue.size();
			for (int i = 0; i < size; i++) {				
				TreeNode curr = queue.poll();
				level.add(curr.val);
				if (curr.left != null) {
					queue.add(curr.left);
				}
				if (curr.right != null) {
					queue.add(curr.right);
				}
			}
			result.add(0, level);
		}
		return result;
	}
	*/
	
	
}
