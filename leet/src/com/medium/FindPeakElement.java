package com.medium;

/**
 * A peak element is an element that is greater than its neighbors.
Given an input array where num[i] != num[i+1], find a peak element and return its index.
The array may contain multiple peaks, then return the index to any one of the peaks is fine.
You may imagine that num[-1] = num[n] = -infinite.

For example, in array [1, 2, 3, 1], 3 is a peak element and your function should return the index number 2.
 * @author yue
 *
 */
public class FindPeakElement {
	public static void main(String[] args) {
		int[] nums = {1,2,3,2,1,5,6,7,8,3,1};
		int[] nums1 = {1,3,4,2,1};
		int[] nums2 = {1};
		int[] nums3 = {3,2,1};
		System.out.println(findPeakElement(nums));
		System.out.println(findPeakElement(nums1));
		System.out.println(findPeakElement(nums2));
		System.out.println(findPeakElement(nums3));
	}
	
	public static int findPeakElement(int[] nums) {
		if (nums.length <= 1 || nums == null) {
			return 0;
		}
		if (nums.length == 2) {
			return nums[0] < nums[1] ? 1 : 0;
		}
        int start = 0;
        int end = nums.length - 1;
        
        while (start + 1 < end) {
			int mid = (start + end) / 2;
			if (nums[mid] < nums[mid - 1] || nums[mid] > nums[mid + 1]) {
				end = mid;
			} else if (nums[mid] < nums[mid + 1] || nums[mid] > nums[mid - 1]) {
				start = mid;
			} 
		}
        return nums[start] < nums[end] ? end : start;
    }
}
