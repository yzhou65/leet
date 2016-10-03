/**
 * 
 */
package com.easy;

/**
 * @author yue
 *
 */
public class ExcelSheetColumnNumber {
	public static void main(String[] args) {
		System.out.println(columnToNumber("AB"));
		System.out.println(columnToNumber("BA"));
	}

	public static int columnToNumber(String title) {
		int result = 0;
		for (int i = 0; i < title.length(); i++) {
			result = result * 26 + title.charAt(i) - 'A' + 1;
		}
		
		return result;
	}
}
