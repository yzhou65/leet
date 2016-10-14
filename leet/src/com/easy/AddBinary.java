package com.easy;

/**
 * Given two binary strings, return their sum (also a binary string).
 * @author yue
 *
 */
public class AddBinary {

	public static void main(String[] args) {
		String a = "111";
		String b = "0";
		System.out.println(addBinary(a, b));
	}
	
	public static String addBinary(String a, String b) {
		if (a.length() < b.length()) {
			String tmp = a;
			a = b;
			b = tmp;
		}
		
		// Now String a is longer than String b
		
		int pa = a.length() - 1;
		int pb = b.length() - 1;
		int carries = 0;
		String rst = "";
		
		while (pb >= 0) {
			int sum = (int)(a.charAt(pa) - '0') + (int)(b.charAt(pb) - '0') + carries;
			carries = sum / 2;
			rst = (sum % 2) + rst;
			pb--;
			pa--;
		}
		
		while (pa >= 0) {
			int sum = (int)(a.charAt(pa) - '0') + carries;
			carries = sum / 2;
			rst = (sum % 2) + rst;
			pa--;
		}
		
		if (carries == 1) {
			rst = "1" + rst;
		}
		return rst;
	}
}
