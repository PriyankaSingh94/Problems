package com;

import java.util.Stack;
import java.util.Vector;

public class NearestLargestLeft {

	public static void main(String[] args) {
		
		int arr[] = { 3, 2, 1, 6, 5, 8, 7, 9, 10 };
		Stack<Integer> st = new Stack<Integer>();
		Vector<Integer> v = new Vector<Integer>();
		int len = arr.length;
		
		for(int i = 0; i < len; i++) {
			while (!st.empty() && st.peek() < arr[i]) {
				st.pop();
			}
			if(st.empty()) {
				v.add(-1);
			} else {
				v.add(st.peek());
			}
			st.push(arr[i]);
		}
		System.out.println(v);
	}
}
