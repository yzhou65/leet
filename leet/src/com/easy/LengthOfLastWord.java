package com.easy;

/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', 
 * return the length of last word in the string.
If the last word does not exist, return 0.
Note: A word is defined as a character sequence consists of non-space characters only.
For example, 
Given s = "Hello World", return 5.
 * @author Yue
 *
 */
public class LengthOfLastWord {
	
	public static void main(String[] args) {
		String s = " ";
		System.out.println(lengthOfLastWord(s));
	}
	
	public static int lengthOfLastWord(String s) {
		char[] chars = s.toCharArray();
		int length = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (length == 0) {
				if (chars[i] == ' ') {
					continue;
				} else {
					length++;
				}
			} else {
				if (chars[i] == ' ') {
					break;
				} else {
					length++;
				}
			}
		}
		return length;
	}

	public static int lengthOfLastWord2(String s) {
		
        String[] strs = s.split(" ");
        int length = strs.length;
        if (length <= 0) {
			return 0;
		}
		return strs[length - 1].length();
    }
}
