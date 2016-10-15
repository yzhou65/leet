package com.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

/**
 * Given a collection of numbers that might contain duplicates, 
 * return all possible unique permutations.
 * @author yue
 *
 */
public class Permutations2 {

	public List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> rst = new ArrayList<List<Integer>>();
        if (nums == null || nums.length == 0) {
			return rst;
		}
        
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        
        Arrays.sort(nums);
        helper(rst, list, visited, nums);
        
        return rst;
    }
	
	private void helper(List<List<Integer>> rst, ArrayList<Integer> list, boolean[] visited, int[] nums) {
		if (list.size() == nums.length) {
			rst.add(new ArrayList<>(list));
		}
		
		for (int i = 0; i < nums.length; i++) {
			if (visited[i] || (i != 0 && nums[i] == nums[i - 1] && visited[i - 1] == false)) {
				continue;
			}
			
			visited[i] = true;
			list.add(nums[i]);
			helper(rst, list, visited, nums);
			list.remove(list.size() - 1);
			visited[i] = false;
		}
	}
}
