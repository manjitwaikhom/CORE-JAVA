package com.sorting;

class BubbleSort {
	public static void main(String args[]) {
		BubbleSort bSort = new BubbleSort();
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		bSort.bubbleSort(arr);

		/* Prints the array */
		System.out.println("Bubble Sorted array");
		int n = arr.length;
		for (int i : arr)
			System.out.print(i + " ");
		    System.out.println();

	}

	void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {  //ascending order
					// swap temp and arr[i]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

}
