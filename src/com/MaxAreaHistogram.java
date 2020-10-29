package com;

import java.util.Arrays;
import java.util.Stack;

class IndexValue {
	int index;
	int value;

	IndexValue(int index, int value) {
		this.index = index;
		this.value = value;
	}
}

public class MaxAreaHistogram {

	public static int[] nearestSmallestLeft(int[] arr) {

		int len = arr.length;
		int[] nsr = new int[len];
		int[] nsl = new int[len];
		Stack<IndexValue> st = new Stack<IndexValue>();
		for (int i = 0; i < len; i++) {
			while (!st.empty() && st.peek().value >= arr[i]) {
				st.pop();
			}
			if (st.empty()) {
				nsl[i] = -1;
			} else {
				nsl[i] = st.peek().index;
			}
			IndexValue index = new IndexValue(i, arr[i]);
			st.push(index);
		}
		System.out.println(Arrays.toString(nsl));
		return nsl;
	}

	public static int[] nearestSmallestRight(int[] arr) {

		int len = arr.length;
		int[] nsr = new int[len];
		Stack<IndexValue> st = new Stack<IndexValue>();
		for (int i = len-1; i >= 0; i--) {
			while (!st.empty() && st.peek().value >= arr[i]) {
				st.pop();
			}
			if (st.empty()) {
				nsr[i] = len;
			} else {
				nsr[i] = st.peek().index;
			}
			IndexValue index = new IndexValue(i, arr[i]);
			st.push(index);
		}
		System.out.println(Arrays.toString(nsr));
		return nsr;
	}
	/**
	 * Adding this method only to be used for MaxAreaBinary
	 */
	public static int maxArea(int[] arr) {
		int area = 0;
		int nsr[] = nearestSmallestRight(arr);
		int nsl[] = nearestSmallestLeft(arr);
		for (int i = 0; i < arr.length; i++) {
			int temp = (nsr[i]-nsl[i]-1) * arr[i];
			if (area< temp) {
				area = temp;
			}
		}
		return area;
	}

	public static void main(String[] args) {

		int arr[] = { 6, 2, 5, 4, 5, 1, 6 };
		int nsr[] = nearestSmallestRight(arr);
		int nsl[] = nearestSmallestLeft(arr);
		int area = 0;
		/*
		 * As We are only concerned about the maximum area no need to have an array just 
		 * get the max in a variable
		 * int[] area = new int[arr.length]; 
		 * for (int i = 0; i < arr.length; i++) {
		 * area[i] = (nsr[i]-nsl[i]-1) * arr[i]; 
		 * }
		 * System.out.println(Arrays.toString(area));
		 */
		for (int i = 0; i < arr.length; i++) {
			int temp = (nsr[i]-nsl[i]-1) * arr[i];
			if (area< temp) {
				area = temp;
			}
		}
		System.out.println(area);
	}
}
