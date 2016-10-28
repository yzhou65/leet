package com.medium;

/**
 * Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, 
 * with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note:
You are not suppose to use the library's sort function for this problem
 * @author Yue
 *
 */
public class SortColor {

	public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) {
			return;
		}
        
        int cur = 0;
        int end = nums.length - 1;
        int i = 0;
        
        while (i <= end) {
			if (nums[i] == 0) {
				swap(nums, i, cur);
				cur++;
				i++;
			} else if (nums[i] == 1) {
				i++;
			} else {
				swap(nums, i, end);
				end--;
			}
		}
    }
	
	private void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
