package com.medium;

/**
 * Given a sorted array of integers, find the starting and ending position of a given target value.
Your algorithm's runtime complexity must be in the order of O(log n).
If the target is not found in the array, return [-1, -1].
For example,
Given [5, 7, 7, 8, 8, 10] and target value 8,
return [3, 4].
 * @author yue
 */
public class SearchForRange {
	
	public int[] searchRange(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;
		int mid = 0;
		int[] bound = new int[2];
		
		// search for left bound
		while (start < end - 1) {
			mid = start + (end - start) / 2;
			if (nums[mid] == target) {
				end = mid;
			} else if (nums[mid] < target) {
				start = mid;
			} else {
				end = mid;
			}
		}
		if (nums[start] == target) {
			bound[0] = start;
		} else if (nums[end] == target) {
			bound[0] = end;
		} else {
			bound[0] = bound[1] = -1;
			return bound;
		}
		
		// search for right bound
		start = 0;
		end = nums.length - 1;
		while (start < end - 1) {
			mid = start + (end - start) / 2;
			if (nums[mid] == target) {
				start = mid;
			} else if (nums[mid] < target) {
				start = mid;
			} else {
				end = mid;
			}
		}
		if (nums[end] == target) {
			bound[1] = end;
		} else if (nums[start] == target) {
			bound[1] = start;
		} else {
			bound[0] = bound[1] = -1;
			return bound;
		}
		
		return bound;
    }
}
