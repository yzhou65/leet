package com.medium;

public class ContainerWithMostWater {

	public static int maxArea(int[] height) {
        if (height.length < 2 || height == null) {
			return 0;
		}
        
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        
        while (left < right) {
			maxArea = Math.max(maxArea, (right - left) * Math.min(height[left], height[right])); 
			if (height[left] < height[right]) {
				left++;
			} else {
				right--;
			}
		}
		return maxArea;
    }
}
