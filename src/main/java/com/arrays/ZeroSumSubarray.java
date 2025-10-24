package com.arrays;

import java.util.Arrays;

public class ZeroSumSubarray {
	public static void main(String[] args) {
		int[] arr = {0, 3, 4, -7, 1, 3, -4, -2, -2, 0, -1, 1};
		int sum=0;

		for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

			if(sum==0){
				System.out.println("Subarray found from index 0 to "+i);
				printSubarray(arr,0,i);
			}
		}
	}

	private static void printSubarray(int[] arr, int start, int end) {
		System.out.print("Elements: [");
		for (int i = start; i <= end; i++) {
			System.out.print(arr[i]);
			if (i < end) System.out.print(", ");
		}
		System.out.println("]");
	}

}

