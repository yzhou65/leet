package com.medium;

/**
 * Write an efficient algorithm that searches for a value in an m x n matrix. 
 * This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
For example,

Consider the following matrix:

[
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
Given target = 3, return true.
 * @author Yue
 *
 */
public class SearchA2DMatrix {

	public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
			return false;
		}
        if (matrix[0] == null || matrix[0].length == 0) {
            return false;
        }
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        int start = matrix[0][cols - 1];
        
        for (int i = 0, j = cols - 1; i < rows && j >= 0;) {
			if (matrix[i][j] == target) {
				return true;
			} else if (matrix[i][j] > target) {
				i++;
			} else {
				j--;
			}
		}
		return false;
    }
}
