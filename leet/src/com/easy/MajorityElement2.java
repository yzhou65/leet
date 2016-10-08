package com.easy;

/**
 * Given an array of size n, find the majority element. 
 * The majority element is the element that appears more than ⌊ n/2 ⌋ times.
You may assume that the array is non-empty and the majority element always exist in the array.
 * @author yue
 *
 */
public class MajorityElement2 {
	public static void main(String[] args) {
		int[] nums = {1,2,6,2,3,2,1,2,2};
		System.out.println(majorityElement(nums));
	}
	

	public static int majorityElement(int[] nums){
		int count = 0;
		int majority = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (count == 0) {
				majority = nums[i];
				count = 1;
			} else if (majority == nums[i]) {
				count++;
			} else {
				count--;
			}
		}
		return majority;
	}
}
