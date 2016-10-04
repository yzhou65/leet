package com.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * The gray code is a binary numeral system where two successive values differ in only one bit.

Given a non-negative integer n representing the total number of bits in the code, 
print the sequence of gray code. A gray code sequence must begin with 0.
 * @author yue
 *
 */
public class GrayCode {
	public static void main(String[] args) {
		System.out.println(grayCode(3));
	}

	public static List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<Integer>();
        if (n <= 1) {
			for (int i = 0; i <= n; i++) {
				result.add(i);
			}
			return result;
		}
        
        // n > 1
        result = grayCode(n - 1);
        
//        ArrayList<Integer> r1 = reverse(result);
//        int x = 1 << (n - 1);
//        for (int i = 0; i < r1.size(); i++) {
//			r1.set(i, r1.get(i) + x);
//		}
//        result.addAll(r1);
        
        int x = 1 << (n - 1);
        for (int i = result.size() - 1; i >= 0; i--) {
			result.add(result.get(i) + x);
		}
        return result;
    }
	
	private static ArrayList<Integer> reverse(List<Integer> list){
		ArrayList<Integer> rev = new ArrayList<>();
		for (int i = list.size() - 1; i >= 0; i--) {
			rev.add(list.get(i));
		}
		return rev;
	}
}
