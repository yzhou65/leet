package com.medium;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

	public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> rst = new ArrayList<List<Integer>>();
        if (nums == null || nums.length == 0) {
			return rst;
		}
        
        ArrayList<Integer> list = new ArrayList<>();
        helper(rst, list, nums);
        
        return rst;
    }
	
	private void helper(List<List<Integer>> rst, ArrayList<Integer> list, int[] nums){
		if (list.size() == nums.length) {
			rst.add(new ArrayList<>(list));
			return;
		}
		for (int i = 0; i < nums.length; i++) {
			if (list.contains(nums[i])) {
				continue;
			}
			list.add(nums[i]);
			helper(rst, list, nums);
			list.remove(list.size() - 1);
		}
	}
	
	
	private void helper2(List<List<Integer>> rst, ArrayList<Integer> list, int[] nums){
		if (list.size() == nums.length) {
			rst.add(new ArrayList<Integer>(list));
			return;
		}
		
		for (int i = 0; i < nums.length; i++) {
			if (list.contains(nums[i])) {
				continue;
			}
			list.add(nums[i]);
			helper(rst, list, nums);
			list.remove(list.size() - 1);
		}
	}
}
