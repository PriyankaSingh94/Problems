package com;

import java.util.Vector;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class StockSpan {
	
	public static int[] stockSpanArr(int[] arr) {
		int len = arr.length;
		int[] res = new int[len];
		res[0] = 1;
		for (int i = 1; i < len; i++) {
			int counter = 1;
			
			while ((i - counter) >= 0 && arr[i] >= arr[i-counter]) {
				counter+=res[i-counter];
			}
			res[i] = counter;
		}
		System.out.println(Arrays.toString(res));
		return res;
	}
	
	public static int[] stockSpan(int[] arr) {
		
		int len = arr.length;
		int[] res = new int[len];
		res[0] = 1;
		Stack<Integer> st= new Stack<Integer>();
		// Index of first element
		st.push(0);
		
		for (int i = 1; i < len; i++) {
			while(!st.empty() && arr[i] >= arr[st.peek()]) {
				st.pop();
			}
			res[i] = (st.empty()) ? (i+1) : (i -st.peek());
			st.push(i);
		}
		System.out.println(Arrays.toString(res));
		return res;
	}
	
	public static int[] stockSpanN2(int[] arr) {
		int len = arr.length;
		int[] res = new int[len];
		res[0] = 1;
		for (int i = 1; i < len; i++) {
			res[i] = 1;
			for (int j = i-1; (j >= 0) && (arr[i] >= arr[j]); j--) {
					res[i]++;
			}
		}
		System.out.println(Arrays.toString(res));
		return res;
	}

	public static void main(String[] args) {
		
		int[] arr = {10, 4, 5, 90, 120, 80};
		int[] arr1 = {100, 80, 60, 50, 60, 75, 85};
		stockSpanN2(arr);
		stockSpan(arr);
		stockSpanN2(arr1);
		stockSpan(arr1);
		stockSpanArr(arr);
	}
}
