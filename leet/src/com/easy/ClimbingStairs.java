package com.easy;

public class ClimbingStairs {
	
	public static void main(String[] args) {
		System.out.println(climbStairs(5));
	}

	public static int climbStairs(int n) {
		if (n <= 1) {
			return n;
		}
		
		int first = 1;
		int second = 1;
		int now = 0;
		for (int i = 2; i <= n; i++) {
			now = first + second;
			first = second;
			second = now;
		}
		return now;
	}
}
