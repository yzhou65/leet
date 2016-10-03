package com.easy;

public class FactorialTrailingZeroes {
	
	public static void main(String[] args) {
		System.out.println(trailingZeroes(10));
		System.out.println(trailingZero(28));
	}

	public static int trailingZeroes(int n) {
        int count = 0;
        while (n != 0) {
			n /= 5;
			count += n;
		}
        return count;
    }
	
	public static int trailingZero(int n) {
        if (n < 5) {
			return 0;
		}
        return n / 5 + trailingZero(n / 5);
    }
}
