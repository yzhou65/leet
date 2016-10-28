package com.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a set of distinct integers, nums, return all possible subsets.
Note: The solution set must not contain duplicate subsets.
For example,
If nums = [1,2,3], a solution is:
[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
*/
public class Subset {
	public static void main(String[] args) {
		int[] nums = {1, 2, 3};
		System.out.println(subsets(nums));
	}

	public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(nums == null || nums.length == 0) {
            return result;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.sort(nums);  
        subsetsHelper(result, list, nums, 0);

        return result;
    }
	
	private static void subsetsHelper(List<List<Integer>> result, ArrayList<Integer> list, int[] nums, int pos) {
		result.add(new ArrayList<>(list));
		
		for (int i = pos; i < nums.length; i++) {
			list.add(nums[i]);
			subsetsHelper(result, list, nums, i + 1);
			list.remove(list.size() - 1);
		}
	}
}
