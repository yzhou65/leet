package com.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public static void main(String[] args) {
		int[] num = {-1,0,1,2,-1,-4};
		System.out.println(threeSum(num));
	}

	public static List<List<Integer>> threeSum(int[] num){
		List<List<Integer>> rst = new ArrayList<List<Integer>>();
		if (num.length < 3 || num == null) {
			return rst;
		}
		Arrays.sort(num);
		
		for (int i = 0; i < num.length - 2; i++) {
			if (i != 0 && num[i] == num[i - 1]) {
				continue;
			}
			
			int left = i + 1;
			int right = num.length - 1;
			while (left < right) {
				int sum = num[i] + num[left] + num[right];
				if (sum == 0) {
					List<Integer> temp = new ArrayList<Integer>();
					temp.add(num[i]);
					temp.add(num[left]);
					temp.add(num[right]);
					rst.add(temp);
					left++;
					right--;
					while (left < right && num[left] == num[left - 1]) { // skip duplicates
						left++;
					}
					while (left < right && num[right] == num[right + 1]) { // skip duplicates
						right--;
					}
				} else if (sum < 0) {
					left++;
				} else {
					right--;
				}
			}
		}
		
		return rst;
	}
}
