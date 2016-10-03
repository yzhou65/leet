/**
 * 
 */
package com.easy;

/**
 * @author yue
 *
 */
public class ExcelSheetColumnTitle {
	public static void main(String[] args) {
		System.out.println((char)('A' + 1));
		System.out.println(numberToColumn(45));
		System.out.println(numberToColumn(28));
	}

	public static String numberToColumn(int n) {
		String result = "";
		while (n > 0) {
			int rem = n % 26;
			
			if (rem == 0) {
				result = "Z" + result;
				n = (n - 26) / 26;
			} else {
				result = (char)('A' + rem - 1) + result;
				n = (n - rem) / 26;
			}
		}
		
		return result;
	}
}
