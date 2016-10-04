package com.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Given n pairs of parentheses, 
 * write a function to generate all combinations of well-formed parentheses.
 * @author yue
 *
 */
public class GenerateParenthesis {

	public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        if (n <= 0) {
			return result;
		}
        getPair(result, "", n, n);
        
        return result;
    }
	
	/**
	 * Put all combinations of well-formed parentheses into result
	 * @param result - result list
	 * @param s
	 * @param left - number of left-half of a parenthesis
	 * @param right - number of right-half of a parenthesis
	 */
	private void getPair(List<String> result, String s, int left, int right){
		if (left > right || left < 0 || right < 0) {
			return;
		}
		if (left == 0 && right == 0) {
			result.add(s);
			return;
		}
		getPair(result, s + "(", left - 1, right);
		getPair(result, s + ")", left, right - 1);
	}
}
