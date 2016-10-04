package com.easy;

/**
 * Implement strStr().

Returns the index of the first occurrence of target in source, 
or -1 if needle is not part of source.
 * @author yue
 *
 */
public class ImplementStrStr {
	public static void main(String[] args) {
		String haystack = "a";
		String needle = "a";
		System.out.println(strStr(haystack, needle));
		System.out.println(needle.length());
	}

	public static int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
			return -1;
		}
        if (haystack.length() == 0 && needle.length() == 0) {
			return 0;
		}
        
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
        	int j = 0;
			for (; j < needle.length(); j++) {
				if (haystack.charAt(i + j) != needle.charAt(j)) {
					break;
				}
			}
			
			// finished loop target found
			if (j == needle.length()) {
				return i;
			}
		}
		
		return -1;
    }
}
