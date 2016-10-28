package com.hard;

public class MatrixChainMultiplication {
    
 // Driver program to test above function
 	public static void main(String args[]) {
 		int arr[] = new int[] {9, 6, 3, 21, 11, 5, 50};

 		System.out.println("\nOptimal chain needs " + matrixChainOrder(arr) + " multiplications");
 	}
 	
    public static int matrixChainOrder(int[] dims) {
        int n = dims.length - 1;
        int[][] m = new int[n][n];
        int[][] s = new int[n][n];

        for (int lenMinusOne = 1; lenMinusOne < n; lenMinusOne++) {
            for (int i = 0; i < n - lenMinusOne; i++) {
                int j = i + lenMinusOne;
                m[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    int cost = m[i][k] + m[k+1][j] + dims[i]*dims[k+1]*dims[j+1];
                    if (cost < m[i][j]) {
                        m[i][j] = cost;
                        s[i][j] = k;
                    }
                }
            }
        }
        printOptimalParenthesizations(s, 0, s.length - 1);
        
        return m[0][n - 1];
    }

    static void printOptimalParenthesizations(int[][]s, int i, int j) {
    	if (i != j) {
    		System.out.print("(");
			printOptimalParenthesizations(s, i, s[i][j]);
			System.out.print("*");
			printOptimalParenthesizations(s, s[i][j] + 1, j);
			System.out.print(")");
		} else {
			System.out.print("A" + i);
		}
    	
        /*if (i != j) {
            printOptimalParenthesizations(s, i, s[i][j], inAResult);
            printOptimalParenthesizations(s, s[i][j] + 1, j, inAResult);
            String istr = inAResult[i] ? "_result " : " ";
            String jstr = inAResult[j] ? "_result " : " ";
            System.out.println(" A_" + i + istr + "* A_" + j + jstr);
            inAResult[i] = true;
            inAResult[j] = true;
        }*/
    }

}
