package com.medium;

/**
	Suppose a sorted array is rotated at some pivot unknown to you beforehand.
	(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
	Find the minimum element.
	You may assume no duplicate exists in the array.
	
	Binary search works. O(log n)
 * @author yue
 *
 */
public class FindMinInRotatedSortedArray {

	public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        
        while (start + 1 < end) {
			int mid = (start + end) / 2;
			if (nums[mid] >= nums[end]) {
				start = mid;
			} else {
				end = mid;
			}
		}
        
        return Math.min(nums[start], nums[end]);
    }
}
