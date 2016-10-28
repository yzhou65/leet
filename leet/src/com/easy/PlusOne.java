package com.easy;

/**
 * Given a non-negative number represented as an array of digits, plus one to the number.
The digits are stored such that the most significant digit is at the head of the list.
 */
public class PlusOne {
	public static void main(String[] args) {
		int[] digits = {9,9,9};
		int[] result = plusOne(digits);
		
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
	
	public static int[] plusOne(int[] digits) {
		int carry = 1;
		for (int i = digits.length - 1; i >= 0; i--) {
			int sum = carry + digits[i];
			digits[i] = sum % 10;
			carry = sum / 10;
		}
		if (carry == 0) {
			return digits;
		}
		
		int[] rst = new int[digits.length + 1];
		rst[0] = 1;
		for (int i = 1; i < rst.length; i++) {
			rst[i] = digits[i - 1];
		}
		return rst;
	}
	
	/*
	public static int[] plusOne(int[] digits){
		int carries = 1;
        for(int i = digits.length - 1; i >=0 && carries > 0; i--){  // fast break when carries equals zero
            int sum = digits[i] + carries;
            digits[i] = sum % 10;
            carries = sum / 10;
        }
        if(carries == 0)
            return digits;
        
        // carries still > 0, initialize a new array
        int[] rst = new int[digits.length+1];
        rst[0] = 1;
        // copy elements of digits into the rest of rst.
        for(int i=1; i< rst.length; i++){
            rst[i] = digits[i-1];
        }
        return rst;
	}*/
}
