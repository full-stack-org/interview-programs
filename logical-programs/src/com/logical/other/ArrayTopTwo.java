package com.logical.other;

import java.util.Arrays;

public class ArrayTopTwo {

	public static void main(String[] args) {
		int numArr[] = new int[] { 1, 99, 34, 24, 65 };

		// Solution 1
		Arrays.sort(numArr);
		System.out.println("Highest Num " + numArr[numArr.length - 1] + " Lowest Num " + numArr[0]); // Highest Num 99

	}

}
