package com.DSA.sorting;

class BubbleSort {
	public static void main(String args[]) {
		BubbleSort bSort = new BubbleSort();
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		int sorted[] = bSort.bubbleSort1(arr);
		//int sorted[] = bSort.bubbleSort2(arr);

		/* Prints the array */
		System.out.println("Bubble Sorted array: ");

		for (int i : sorted)
			System.out.print(i + " ");
		System.out.println();

	}

	// first approach
	int[] bubbleSort1(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) { // ascending order
					// swap temp and arr[i]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
		return arr;
	}

	// second approach
	int[] bubbleSort2(int arr[]) {
		boolean sorted = false;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					sorted = false;
				}
			}
		}
		return arr;
	}
}
