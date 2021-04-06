package com.wiwatyooraks.java2;

public class java2_8 {
	public static void main(String[] args) {
		int[][] twoD_Array = { {1, 2, 3},{4, 5, 6} };
		for (int[] row : twoD_Array) {
			for (int element : row) {
				System.out.println("E1 : " + element);
			}
			System.out.println(row.length + twoD_Array.length);
		}
	}
}


