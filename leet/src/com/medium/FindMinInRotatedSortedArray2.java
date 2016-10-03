package com.medium;

/**
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
Find the minimum element.
The array may contain duplicates.

Binary search does not work. Only does traverse from left to right work. O(n)
 * @author yue
 *
 */
public class FindMinInRotatedSortedArray2 {

	public int findMin(int[] nums) {
        int min = nums[0];
        
        for (int i = 0; i < nums.length; i++) {
			if (nums[i] < min) {
				min = nums[i];
			}
		}
        return min;
    }
}
