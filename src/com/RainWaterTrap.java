package com;

import java.util.Arrays;

public class RainWaterTrap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1,1};
		int area = 0;
		int len = arr.length;
		int[] mxl = new int[len];
		int[] mxr = new int[len];
		mxl[0] = arr[0];
		mxr[len-1] = arr[len-1];
		System.out.println(Arrays.toString(mxr));
		for (int i = 1; i < len; i++) {
			if (arr[i] > mxl[i-1]) {
				mxl[i] = arr[i];
			} else {
				mxl[i] = mxl[i-1];
			}
			if (arr[len-1-i] > mxr[len-i]) {
				mxr[len-1-i] = arr[len-1-i];
			} else {
				mxr[len-1-i] = mxr[len-i];
			}
		}
		System.out.println(Arrays.toString(mxl));
		System.out.println(Arrays.toString(mxr));
		for (int i = 0; i < len; i++) {
			if (mxr[i] < mxl[i]) {
				area+=mxr[i]-arr[i];
			} else {
				area+=mxl[i]-arr[i];
			}
		}
		System.out.println(area);
	}
}
