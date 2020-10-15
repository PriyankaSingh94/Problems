package com;

import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

public class NearestLargestRight {

	public static Vector<Integer> nearestLargestRight(int[] arr) {
		Stack<Integer> st = new Stack<Integer>();
		Vector<Integer> v = new Vector<Integer>();
		int len = arr.length;

		for (int i = len - 1; i >= 0; i--) {
			while (!st.empty() && st.peek() <= arr[i]) {
				st.pop();
			}
			if (st.empty()) {
				v.add(-1);
			} else {
				v.add(st.peek());
			}
			st.push(arr[i]);
		}
		/**
		 * Take array and directly assign at the end then no need to reverse
		 */
		Collections.reverse(v);
		System.out.println(v);
		return v;
	}

	public static void main(String[] args) {

		int arr[] = { 3, 2, 1, 6, 5, 8, 7, 9, 10 };
		nearestLargestRight(arr);
	}
}
