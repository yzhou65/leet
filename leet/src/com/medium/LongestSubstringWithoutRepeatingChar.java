package com.medium;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingChar {

	public int lengthOfLongestSubstring(String s){
		if (s == null || s.length() == 0) {
			return 0;
		}
		HashSet<Character> set = new HashSet<>();
		
		int left = 0;
		int max = 0;
		for (int i = 0; i < s.length(); i++) {
			if (set.contains(s.charAt(i))) {
				while (left < i && s.charAt(left) != s.charAt(i)) {
					set.remove(s.charAt(left));
					left++;
				}
				left++;
			} else {
				set.add(s.charAt(i));
				max = Math.max(max, i - left + 1);
			}
		}
		
		return max;
	}
}
