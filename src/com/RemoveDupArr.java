package com;

/**
 * Remove duplicates from sorted array
 *
 */
public class RemoveDupArr {

	// Time = O(n) space = O(n)
	public static void removeDups(int arr[]) {
		int len = arr.length;
		int[] temp = new int[len];
		
		int j = 0;
		
		for (int i = 0; i < len-1; i++) {
			if (arr[i] != arr[i+1]) {
				temp[j++] = arr[i];
			}
			
		}
		temp[j++] = arr[len-1];
		
		for (int i = 0; i < len; i++) {
			System.out.print(temp[i]+" ");
		}
	}
	
	public static int removeDups1(int arr[]) {
		int len = arr.length;
		int[] temp = new int[len];
		
		int j = 0;
		
		for (int i = 0; i < len-1; i++) {
			if (arr[i] != arr[i+1]) {
				arr[j++] = arr[i];
			}
			
		}
		arr[j++] = arr[len-1];
		
		return j;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 2, 3, 4, 4, 4};
		int len = removeDups1(arr);
		for (int i = 0; i < len; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
