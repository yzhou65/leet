package com.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a collection of candidate numbers (C) and a target number (T), 
 * find all unique combinations in C where the candidate numbers sums to T.
Each number in C may only be used once in the combination.

Note:
All numbers (including target) will be positive integers.
The solution set must not contain duplicate combinations.
For example, given candidate set [10, 1, 2, 7, 6, 1, 5] and target 8, 
A solution set is: 
[
  [1, 7],
  [1, 2, 5],
  [2, 6],
  [1, 1, 6]
]
 * @author yue
 *
 */
public class CombinationSum2 {
	
	public static void main(String[] args) {
		int[] candidates = {10,1,2,7,6,1,5};
		int target = 8;
		
		System.out.println(combinationSum(candidates, target));
	}

	private static List<List<Integer>> result;
	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates == null || candidates.length == 0) {
			return result;
		}
        
        result = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();
        Arrays.sort(candidates);
        
        assist(candidates, target, path, 0);
        
		return result;
    }
	
	private static void assist(int[] candidates, int target, ArrayList<Integer> path, int index) {
		if (target == 0) {
			result.add(new ArrayList<>(path));
		}
		if (index >= candidates.length || target < 0) {
			return;
		}
		
		int prev = -1;
		for (int i = index; i < candidates.length; i++) {
			if (candidates[i] > target) {
				break;
			}
//			if (prev != -1 && prev == candidates[i]) {
//				continue;
//			}
			
			if (candidates[i] != prev) {
				path.add(candidates[i]);
				assist(candidates, target - candidates[i], path, i + 1);
				prev = candidates[i];
				path.remove(path.size() - 1);
			}
		}
	}
}
