package com.medium;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * Given a list of non negative integers, arrange them such that they form the largest number.
For example, given [3, 30, 34, 5, 9], the largest formed number is 9534330.
Note: The result may be very large, so you need to return a string instead of an integer
 * @author Yue
 *
 */
public class LargestNumber {
	
	public String largestNumber(int[] nums) {
		String[] strs = new String[nums.length];
		for (int i = 0; i < nums.length; i++) {
			strs[i] = nums[i] + "";
		}
		Arrays.sort(strs, new StringComparator());
		StringBuilder sb = new StringBuilder();
		for (String str: strs) {
			sb.append(str);
		}
		
		String result = sb.toString();
		int j = 0;
		while (j < sb.length() && result.charAt(j) == '0') {
			j++;
		}
		
		return j == result.length() ? "0" : result.substring(j);
    }
	
	private class StringComparator implements Comparator<String> {

		@Override
		public int compare(String o1, String o2) {
			return (o2 + o1).compareTo(o1 + o2);
		}
		
	}
}
