package com;

import java.util.Stack;

public class MinItemStack {
	
	static Stack<Integer> st = new Stack<Integer>();
	static Stack<Integer> st1 = new Stack<Integer>();
	
	static void push(int a) {
		st.push(a);
		if (st1.empty() || st1.peek() >= a) {
			st1.push(a);
		}
	}
	
	static int pop() {
		if (st.empty()) {
			return -1;
		}
		int num = st.pop();
		
		if (st1.peek() == num) {
			st1.pop();
		}
		return st1.peek();
	}
	
	static int getMin() {
		if(st1.empty()) {
			return -1;
		}
		return st1.peek();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {18, 19, 29, 15, 16};
		Stack<Integer> st = new Stack<Integer>();
		Stack<Integer> st1 = new Stack<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			
		}
	}
}
