package com.logical.other;

public class BinarySearch {
	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 10, 40 };
		int searchElement = 10;
		int left = 0;
		int right = arr.length - 1;

		int result = binarySearch(arr, left, right, searchElement);
		
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
	}

	static int binarySearch(int arr[], int left, int right, int x) {
		if (right >= left) {
			int mid = left + (right - left) / 2;
			System.out.println("mid " +mid);
			// If the element is present at the
			// middle itself
			if (arr[mid] == x)
				return mid;

			// If element is smaller than mid, then
			// it can only be present in left subarray
			if (arr[mid] > x)
				return binarySearch(arr, left, mid - 1, x);

			// Else the element can only be present
			// in right subarray
			return binarySearch(arr, mid + 1, right, x);
		}

		// We reach here when element is not present
		// in array
		return -1;
	}

}
