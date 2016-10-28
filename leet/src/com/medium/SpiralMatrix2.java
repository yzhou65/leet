package com.medium;

import java.util.ArrayList;
import java.util.List;

/**
Given an integer n, generate a square matrix filled with elements from 1 to n^2 in spiral order.

For example,
Given n = 3,

You should return the following matrix:
[
 [ 1, 2, 3 ],
 [ 8, 9, 4 ],
 [ 7, 6, 5 ]
]
 */
public class SpiralMatrix2 {
	public static void main(String[] args) {
		System.out.println(generateMatrix(4)[1][1]);
	}

	public static int[][] generateMatrix(int n) {
        if (n < 0) {
			return null;
		}

        int[][] matrix = new int[n][n];
        
        int rows = 0;
        int cols = 0;
        int num = 1;
        while(n > 0){
            if (n == 1) {
				matrix[rows][cols] = num++;
				break;
			}
            
            for(int i = 0; i < n - 1; i++)
                matrix[rows][cols + i] = num++;
                
            for(int i = 0; i < n - 1; i++)
                matrix[rows + i][cols + n - 1] = num++;
                
            for(int i = cols + n - 1; i > cols; i--)
                matrix[rows + n - 1][i] = num++;
            
            for(int i = rows + n - 1; i > rows; i--)
            	matrix[i][cols] = num++;
            
            rows++;
            cols++;
            n -= 2;
        }
        return matrix;
    }
}
