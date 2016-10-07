package com.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 Given a digit string, return all possible letter combinations that the number could represent. 
 A mapping of digit to letters (just like on the telephone buttons) is given below. 

Input:Digit string "23" 
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]. 

Note: Although the above answer is in lexicographical order, your answer could be in any order you want.
 * @author Yue
 *
 */
public class LetterCombinationsOfPhoneNumber {

	public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<String>();
        if (digits == null || digits.length() == 0) {
			return result;
		}
        
        Map<Character, char[]> map = new HashMap<Character, char[]>();
        map.put('0', new char[] {});
        map.put('1', new char[] {});
        map.put('2', new char[] { 'a', 'b', 'c' });
        map.put('3', new char[] { 'd', 'e', 'f' });
        map.put('4', new char[] { 'g', 'h', 'i' });
        map.put('5', new char[] { 'j', 'k', 'l' });
        map.put('6', new char[] { 'm', 'n', 'o' });
        map.put('7', new char[] { 'p', 'q', 'r', 's' });
        map.put('8', new char[] { 't', 'u', 'v'});
        map.put('9', new char[] { 'w', 'x', 'y', 'z' });
        
        StringBuilder sb = new StringBuilder();
        helper(map, digits, sb, result);
        return result;
    }
	private void helper(Map<Character, char[]> map, String digits, StringBuilder sb, List<String> result) {
		if (sb.length() == digits.length()) {
			result.add(sb.toString());
			return;
		}
		
		for (char c : map.get(digits.charAt(sb.length()))) {
			sb.append(c);
			helper(map, digits, sb, result);
			sb.deleteCharAt(sb.length() - 1);
		}
	}
	
	private void helper2(Map<Character, char[]> map, String digits, StringBuilder sb, List<String> result) {
		if (sb.length() == digits.length()) {
			result.add(sb.toString());
			return;
		}

		for (char c : map.get(digits.charAt(sb.length()))) {
			sb.append(c);
			helper(map, digits, sb, result);
			sb.deleteCharAt(sb.length() - 1);
		}
	}
}
