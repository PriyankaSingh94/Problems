package com;

import java.util.Scanner;
import java.util.Stack;

public class MinItemStackO1 {

	static int min = 0;
	static Stack<Integer> st = new Stack<Integer>();
	
	static void push(int a) {
		if (st.empty()) {
			st.push(a);
			min = a;
			return;
		}
		if (min > a) {
			st.push(2 * a - min);
			min = a;
		} else {
			st.push(a);
		}
	}

	static int pop() {
		if (st.empty()) {
			return -1;
		}
		if (st.peek() >= min) {
			return st.pop();
		} else {
			min = 2 * min - st.peek();
			return st.pop();
		}
	}

	static int top() {
		if (st.empty()) {
			return -1;
		}
		if (st.peek() < min) {
			return 2 * min - st.peek();
		}
		return st.peek();
	}

	static int getMin() {
		if (st.empty()) {
			return -1;
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		push(10);
		push(7);
		push(8);
		push(1);
		push(3);
		push(5);
		push(7);
		
		Scanner sc = new Scanner(System.in);
		System.out.println(getMin());
		pop();
		pop();
		pop();
		pop();
		System.out.println(getMin());
		int num = sc.nextInt();
		
	}
}
