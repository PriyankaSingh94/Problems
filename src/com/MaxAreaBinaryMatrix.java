package com;

import java.util.Arrays;

public class MaxAreaBinaryMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] bin = {{0, 1, 1, 0},{1, 1, 1, 1},{1, 1, 1, 1},{1, 1, 0, 0}};
		 int[] arr = new int[bin[0].length];
		 for (int j = 0; j < bin[0].length; j++) {
			arr[j] = bin[0][j]; 
		 }
		 int maxArea =MaxAreaHistogram.maxArea(arr);
		 for (int i = 1; i < bin.length; i++) {
			 arr = bin[i];
			 
			 for (int j = 0; j < arr.length; j++) {
				 
				if (arr[j] != 0) {
					arr[j]+=bin[i-1][j];
				}
			 }
			 System.out.println(Arrays.toString(arr));
			 int temp = MaxAreaHistogram.maxArea(arr);
			 System.out.println(temp);
			 if (maxArea < temp) {
				 maxArea = temp;
			 }
		 }
		 System.out.println(maxArea);
	}
}
