package com;

import java.util.HashSet;

public class MissingNumArray {
	
	public static void findMissing(int[] arr1, int[] arr2) {
		HashSet<Integer> set = new HashSet<Integer>();
		
		for (int i = 0; i < arr2.length; i++) {
			set.add(arr2[i]);
		}
		
		for (int i = 0; i < arr1.length; i++) {
			if (!set.contains(arr1[i])) {
				System.out.print(arr1[i]+" ");
			}
		}
	}

	public static void main(String[] args) {
		int[] arr1 = new int[100];
		for (int i =0; i < 100; i++) {
			arr1[i] = i+1;
		}
		
		int[] arr2 = new int[500];
		for (int i =0; i < 500; i++) {
			arr2[i] =(int) Math.floor(Math.random()*101);
		}
		findMissing(arr1, arr2);
	}
}
