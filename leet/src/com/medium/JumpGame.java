package com.medium;

/**
Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.
 * @author yue
 *
 */
public class JumpGame {

	// dynamic programming
	public boolean canJump(int[] nums){
		// think it as merging n intervals
		if (nums == null || nums.length == 0 || nums[0] == 0) {
			return false;
		}
		int farthest = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (i <= farthest && nums[i] + i >= farthest) {
				farthest = nums[i] + i;
			}
		}
		return farthest >= nums.length - 1;
	}
	
	
	//Greedy. O(n)
	public boolean canJump2(int[] nums) {
        boolean[] can = new boolean[nums.length];
        can[0] = true;
        
        for (int i = 1; i < nums.length; i++) {
			for (int j = 0; j < i; j++) {
				if (can[j] && j + nums[j] >= i) {
					can[i] = true;
					break;
				}
			}
		}
		return can[nums.length - 1];
    }
	
}
