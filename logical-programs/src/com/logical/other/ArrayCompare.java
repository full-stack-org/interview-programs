package com.logical.other;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayCompare {

	public static void main(String[] args) {
		
		int numArr[] = { 1, 99, 34, 24, 65 };
		int numArr2[] = { 1, 87, 34, 64, 65 };

		// Checking both arrays are Equal
		Object[] arr1 = { numArr };
		Object[] arr2 = { numArr2 };

		if (Arrays.deepEquals(arr1, arr2)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal"); // Not Equal
		}

		// Finding out two common elements in two arrays
		Set<Integer> setOne = new HashSet<>();
		Arrays.stream(numArr).forEach(item -> setOne.add(item));
		
		Set<Integer> setTwo = new HashSet<>();
		Arrays.stream(numArr2).forEach(item -> setTwo.add(item));
		
		setOne.retainAll(setTwo);
		
		System.out.println(setOne); //[1, 65, 34]

	}

}
