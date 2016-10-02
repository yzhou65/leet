package com.medium;

import java.util.Stack;

public class EvaluateReversePolishNotation {
	public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        String operators = "+-*/";
        
        for (String token : tokens) {
			if (!operators.contains(token)) {
				s.push(Integer.parseInt(token));
			}
			else {
				int operand1 = s.pop();
				int operand2 = s.pop();
				if (token.equals("+")) {
					s.push(operand2 + operand1);
				} else if (token.equals("-")) {
					s.push(operand2 - operand1);
				} else if (token.equals("*")) {
					s.push(operand2 * operand1);
				} else if (token.equals("/")) {
					s.push(operand2 / operand1);
				}
			}
		}
        return s.pop();
    }
}
