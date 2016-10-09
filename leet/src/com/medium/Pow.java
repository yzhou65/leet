package com.medium;

/**
 * pow(x, n) calculates x to the power of n
 * @author yue
 *
 */
public class Pow {

	public double myPow(double x, int n) {
        if (n == 0 || x == 1) {
			return 1;
		}
        if (x == -1 && n == Integer.MIN_VALUE) {
        	return 1;
        }
        if (x > 0 && n == Integer.MIN_VALUE) {
			return 0;
		}
        if (n == 1) {
			return x;
		}
        
        boolean isNegative = false;
        if (n < 0) {
			isNegative = true;
			n *= -1;
		}
        
        int k = n / 2;
        int l = n - k * 2;
        double t1 = myPow(x, k);
        double t2 = myPow(x, l);
        if (isNegative) {
			return 1 / (t1 * t1 * t2);
		} else {
			return t1 * t1 * t2;
		}
    }
}
