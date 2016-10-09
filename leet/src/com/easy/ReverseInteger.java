package com.easy;
/**
 * Reverse digits of an integer
 * @author yue
 *
 */
public class ReverseInteger {
	public static void main(String[] args) {
		System.out.println(reverse(1534236469));
		System.out.println(Integer.MAX_VALUE);
	}
	
	public static int reverse(int x){
		int rst = 0;
		while(x != 0){
			int temp = rst * 10 + x % 10;
			x = x / 10;
			
			// check if max value of integer is reached
			if (temp / 10 != rst) {
				rst = 0;
				break;
			}
			rst = temp;
			System.out.printf("%d, %d\n", rst, x);
		}
		return rst;
	}

	public int reverse2(int x) {
        int rst = 0;
        while (x != 0) {
			int temp = rst * 10 + x % 10;
			x = x / 10;
			if (temp / 10 != rst) {
				rst = 0;
				break;
			}
			rst = temp;
		}
        return rst;
    }
}
