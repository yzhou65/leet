package com.easy;

/**
 * Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times. 
 * The algorithm should run in linear time and in O(1) space.
 * @author yue
 */
public class MajorityElement {
	public static void main(String[] args) {
		int[] nums = {1,2,6,2,3,2,1,2,2};
		System.out.println(majorityElement(nums));
	}
	

	public static int majorityElement(int[] nums){
		int count1 = 0, count2 = 0;
		int candidate1 = 0, candidate2 = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (candidate1 == nums[i]) {
				count1++;
			} else if (candidate2 == nums[i]) {
				count2++;
			} else if (count1 == 0) {
				candidate1 = nums[i];
				count1 = 1;
			} else if (count2 == 0) {
				candidate2 = nums[i];
				count2 = 1;
			} else {
				count1--;
				count2--;
			}
		}
		
		count1 = count2 = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == candidate1) {
				count1++;
			} else if (nums[i] == candidate2) {
				count2++;
			}
		}
		return count1 > count2 ? candidate1 : candidate2;
	}
}
