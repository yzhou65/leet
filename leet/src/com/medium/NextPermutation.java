package com.medium;

/**
 * Implement next permutation, which rearranges numbers into the lexicographically 
 * next greater permutation of numbers.
If such arrangement is not possible, it must rearrange it as the lowest possible order 
(ie, sorted in ascending order).
The replacement must be in-place, do not allocate extra memory.
 * @author yue
 *
 */
public class NextPermutation {

	public void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0) {
			return;
		}
        
        int index = 0;
        for (int i = nums.length - 2; i >= 0; i--) {
			if (nums[i] < nums[i + 1]) {
				index = i;
				break;
			}
		}
        if (index < 0) {
			return;
		}
        
        int pivot = nums.length - 1;
        for(; pivot > index; pivot--){
        	if (nums[pivot] > nums[index]) {
				break;
			}
        }
        
        swap(nums, index, pivot);
        reverse(nums, index + 1, nums.length - 1);
    }
	
	/**
	 * reverse a subarray from 'start' to 'end'
	 */
	private void reverse(int[] num, int start, int end){
		for (int i = start, j = end; i < j; i++, j--) {
			swap(num, i, j);
		}
	}
	
	/**
	 * swap two elements of an array at index i and j
	 */
	private void swap(int[] num, int i, int j){
		int temp = num[i];
		num[i] = num[j];
		num[j] = temp;
	}
	
}
