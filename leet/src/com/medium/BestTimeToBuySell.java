package com.medium;

public class BestTimeToBuySell {

	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));
	}
	
	public static int maxProfit(int[] prices) {
		if (prices.length == 0 || prices == null) {
			return 0;
		}
		
		int min = Integer.MAX_VALUE;
		int profit = 0;
		for (int i : prices) {
			min = i < min ? i : min;
			profit = (i - min) > profit ? i - min : profit;
		}
		
		return profit;
	}
}
