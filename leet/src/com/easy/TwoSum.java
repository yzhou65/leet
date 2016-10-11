package com.easy;

import java.util.HashMap;

/**
 * Given an array of integers, return indices of the two numbers such that 
 * they add up to a specific target.
You may assume that each input would have exactly one solution.
 * @author yue
 *
 */
public class TwoSum {
	public static void main(String[] args) {
		int[] nums = {3,2,4};
		System.out.println(twoSum(nums, 6)[0] + " " + twoSum(nums, 6)[1]);
	}
	
	// use hashmap
	public static int[] twoSum(int[] nums, int target){
		if (nums == null || nums.length < 2) {
			return null;
		}
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.get(nums[i]) != null) {
				int[] result = {map.get(nums[i]) + 1, i + 1};
				return result;
			}
			map.put(target - nums[i], i);
		}
		return null;
	}

	// O(n^n)
	public static int[] twoSum2(int[] nums, int target) {
		int[] result = new int[2];
		if (nums == null || nums.length < 2) {
			return result;
		}
		
		int i, j;
		for (i = 0; i < nums.length - 1; i++) {
			for (j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					result[0] = i;
					result[1] = j;
					return result;
				}
			}
		}
        
        return result;
    }
}
