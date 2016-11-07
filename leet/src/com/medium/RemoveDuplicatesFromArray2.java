package com.medium;

/**
Follow up for "Remove Duplicates":
What if duplicates are allowed at most twice?

For example,
Given sorted array nums = [1,1,1,2,2,3],

Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3. 
It doesn't matter what you leave beyond the new length.
 *
 */
public class RemoveDuplicatesFromArray2 {
	
	public static void main(String[] args) {
		int[] nums = {1,1,2,3,5,5};
		System.out.println(removeDuplicates(nums));
	}

	public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
			return 0;
		}
        int cur = 0;
        int i, j;
        for (i = 0; i < nums.length;) {
			for (j = i; j < nums.length; j++) {
				if (nums[j] != nums[i]) {
					break;
				}
				if (j - i < 2) {
					nums[cur++] = nums[i];
				}
			}
			i = j;
		}
		return cur;
    }
}
