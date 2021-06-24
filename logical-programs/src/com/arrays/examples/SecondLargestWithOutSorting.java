package com.arrays.examples;

public class SecondLargestWithOutSorting {

	public static void main(String[] args) {
		int[] arr = { 7, 5, 6, 1, 4, 2 };

		int highest = 0;
		int secondHighest = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > highest) {
				secondHighest = highest;
				highest = arr[i];
			} else if (arr[i] > secondHighest) {
				secondHighest = arr[i];
			}
		}
		
		System.out.println(secondHighest); //6
	}

}
