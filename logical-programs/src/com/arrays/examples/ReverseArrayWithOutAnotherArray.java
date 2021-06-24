package com.arrays.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArrayWithOutAnotherArray {

	public static void main(String[] args) {
		Integer[] inputArray = { 12, 9, 21, 17, 33, 7 };

		// Approach 1
		//List<Integer> intList = Arrays.asList(inputArray);
		//Collections.reverse(intList);
		//intList.forEach(System.out::print); //7 33 17 21 9 12

		// Approach 2
		System.out.println("Array After Reverse : " + Arrays.toString(reverse(inputArray)));//Array After Reverse : [12, 9, 21, 17, 33, 7]

	}

	public static Integer[] reverse(Integer[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
		return array;
	}

}
