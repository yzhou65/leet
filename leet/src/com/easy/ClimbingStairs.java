package com.easy;

/**
 * You are climbing a stair case. It takes n steps to reach the top. 
 * Every time you can either climb 1 or 2 steps. In how many distinct ways can you climb to top?
 * @author yue
 *
 */
public class ClimbingStairs {
	
	public static void main(String[] args) {
		System.out.println(climbStairs(5));
	}

	// The number of distinct ways follows Fibonacci.
	// Use dynamic programming
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
