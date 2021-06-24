package com.logical.other;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = { 3, 60, 35, 2, 45, 320, 5 };

		int n = arr.length;
		int temp = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n - i; j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		Arrays.stream(arr).forEach(System.out::println); //2 3	5 35 45	60	320

	}

}
