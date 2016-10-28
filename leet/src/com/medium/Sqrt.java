package com.medium;

/**
 * Implement int sqrt(int x).
Compute and return the square root of x.
 * @author Yue
 *
 */
public class Sqrt {
	public static void main(String[] args) {
		System.out.println(mySqrt(110));
	}

	public static int mySqrt(int x) {
        if (x == 0 || x == 1) {
			return x;
		}
        
        long start = 1;
        long end = x;
        
        while (start + 1 < end) {
			long mid = (start + end) / 2;
			if (mid * mid > x) {
				end = mid;
			} else {
				start = mid;
			}
			
		}
        
        if (end * end <= x) {
        	return (int)end;
        }
        return (int)start;
    }
}
