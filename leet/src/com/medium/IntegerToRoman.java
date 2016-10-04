package com.medium;

/**
 * Given an integer, convert it to a roman numeral.

Input is guaranteed to be within the range from 1 to 3999.
 * @author yue
 *
 */
public class IntegerToRoman {

	public String intToRoman(int num) {
		if (num <= 0) {
			return "";
		}
		int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		String[] symbolsStrings = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		
		StringBuilder sb = new StringBuilder();
		int index = 0;
		while (num > 0) {
			int times = num / nums[index];
			num -= nums[index] * times;
			for(; times > 0; times--){
				sb.append(symbolsStrings[index]);
			}
			index++;
		}
		return sb.toString();
	}
}
