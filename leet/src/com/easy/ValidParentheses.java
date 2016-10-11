package com.easy;

import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', 
 * determine if the input string is valid.
The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 * @author yue
 *
 */
public class ValidParentheses {

	public boolean isValid(String s) {
        String left = "({[";
        Stack<Character> stack = new Stack<>();
        
        for (Character c : s.toCharArray()) {
			if (left.contains(c + "")) {
				stack.push(c);
			} else {
				if (!stack.isEmpty() && is_valid(stack.peek(), c)) {
					stack.pop();
				} else {
					return false;
				}
			}
		}
        
        return stack.isEmpty();
    }
	
	private boolean is_valid(char c1, char c2){
		return (c1 == '(' && c2 == ')') || (c1 == '{' && c2 == '}') || (c1 == '[' && c2 == ']');
	}
}
