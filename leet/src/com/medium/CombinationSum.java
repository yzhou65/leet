package com.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
	
	public static void main(String[] args) {
		int[] candidates = {2,3,6,7};
		int target = 7;
		
		System.out.println(combinationSum(candidates, target));
	}
	
	private static List<List<Integer>> result;

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates == null) {
			return result;
		}
        
        result = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();
        Arrays.sort(candidates);
        
        assist(candidates, target, path, 0, result);
        
//		helper(candidates, target, path, 0, result);    
		return result;
    }
	
	private static void assist(int[] candidates, int target, ArrayList<Integer> path, int index, List<List<Integer>> result) {
		if (target == 0) {
			result.add(new ArrayList<>(path));
		}
		
		int prev = -1;
		for (int i = index; i < candidates.length; i++) {
			if (candidates[i] > target) {
				break;
			}
			if (prev != -1 && prev == candidates[i]) {
				continue;
			}
			path.add(candidates[i]);
			assist(candidates, target - candidates[i], path, i, result);
			path.remove(path.size() - 1);
			prev = candidates[i];
		}
	}
	
	private static void helper(int[] candidates, int target, ArrayList<Integer> path, int index, List<List<Integer>> result) {
		if (target == 0) {
			result.add(new ArrayList<>(path));
			return;
		}
		
		int prev = -1;
		for (int i = index; i < candidates.length; i++) {
			if (candidates[i] > target) {
				break;
			}
			
			if (prev != -1 && prev == candidates[i]) {
				continue;
			}
			
			path.add(candidates[i]);
			helper(candidates, target - candidates[i], path, i, result);
			path.remove(path.size() - 1);
			
			prev = candidates[i];
		}
	}
}
