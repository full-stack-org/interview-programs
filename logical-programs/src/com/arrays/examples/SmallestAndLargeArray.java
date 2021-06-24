package com.arrays.examples;

public class SmallestAndLargeArray {

	public static void main(String[] args) {
		int[] intArr = { 9, 3, 2, 1 };

		int smallest = intArr[0];
		int largest = intArr[0];

		for (int i = 1; i < intArr.length; i++) {

			if (intArr[i] > largest) {
				largest = intArr[i];
			} else if (intArr[i] < smallest) {
				smallest = intArr[i];

			}

		}
		System.out.println("Smallest Number is : " + smallest);
		 System.out.println("Largest Number is : " + largest); 
	}
}
