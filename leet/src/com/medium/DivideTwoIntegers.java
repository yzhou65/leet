package com.medium;

public class DivideTwoIntegers {
	public static void main(String[] args) {
		System.out.println(divide(31, 3));
	}

	public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
			throw new ArithmeticException("divided by 0");
		}
        if (dividend == 0) {
			return 0;
		}
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
			return Integer.MAX_VALUE;
		}
        
        boolean isNegative = (dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0);
        
        long a = Math.abs((long)dividend);
        long b = Math.abs((long)divisor);
        
        int result = division(a, b);
        
        
        return (isNegative ? -result : result);
    }
	
	private static int division(long a, long b){
		if (a < b) {
			return 0;
		}
		int shift = 0;
		while (a >= b << (shift)) {
			shift++;
		}
		return (1 << (shift - 1)) + division(a - (b << (shift - 1)), b);
	}
}
