package com.medium;

/**
 * Given a sorted array and a target value, return the index if the target is found. 
 * If not, return the index where it would be if it were inserted in order.
You may assume no duplicates in the array.

Here are few examples.
[1,3,5,6], 5 → 2
[1,3,5,6], 2 → 1
[1,3,5,6], 7 → 4
[1,3,5,6], 0 → 0
 * @author yue
 */
public class SearchInsertPosition {

	public int searchInsert(int[] nums, int target) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int start = 0;
		int end = nums.length - 1;
		if (nums[start] >= target) {
			return 0;
		}
		if (nums[end] < target) {
			return nums.length;
		}
		
		while(start < end - 1){
			int mid = (start + end) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] < target) {
				start = mid;
			} else {
				end = mid;
			}
		}
		
		if (nums[start] >= target) {
			return start;
		} else if (nums[end] >= target) {
			return end;
		} else {
			return end + 1;
		}
    }
}
