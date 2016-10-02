package com.medium;

import java.util.Arrays;

public class ThreeSumClosest {

	public static void main(String[] args) {
		int[] num = {-1, 2, 1, -4};
		int target = 1;
		System.out.println(threeSumClosest(num, target));
	}
	
	public static int threeSumClosest(int[] num, int target) {
		if (num.length < 3 || num == null) {
			return Integer.MAX_VALUE;
		}
		Arrays.sort(num);
		int closest = Integer.MAX_VALUE / 2;
		
		for (int i = 0; i < num.length - 2; i++) {
			int left = i + 1;
			int right = num.length - 1;
			while (left < right) {
				int sum = num[i] + num[left] + num[right];
				if (sum == target) {
					return sum;
				} else if (sum < target) {
					left++;
				} else {
					right--;
				}
				closest = Math.abs(sum - target) < Math.abs(closest - target) ? sum : closest;
			}
		}
		
		return closest;
	}
}
