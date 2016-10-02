package com.medium;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
	public static List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> rst = new ArrayList<List<Integer>>();
		ArrayList<Integer> solution = new ArrayList<>();
		
		assist(rst, solution, n, k, 1);
		return rst;
    }
	
	private static void assist(List<List<Integer>> rst, ArrayList<Integer> solution, int n ,int k, int start){
		if (solution.size() == k) {
			rst.add(new ArrayList<>(solution));
			return;
		}
		
		for (int i = start; i <= n; i++) {
			solution.add(i);
			assist(rst, solution, n, k, i + 1);
			solution.remove(solution.size() - 1);
		}
	}
	
	/*private static void assist(List<List<Integer>> rst, ArrayList<Integer> solution, int n, int k, int start){
		// check the size of solution every recursion call and return if it is k
		if (solution.size() == k) {
			rst.add(new ArrayList<>(solution));
			return;
		}
		
		for (int i = start; i <= n; i++) {
			solution.add(i);
			
			// the new start should be after the next number after i
			assist(rst, solution, n, k, i+1);
			solution.remove(solution.size() - 1);
		}
	}*/
}
