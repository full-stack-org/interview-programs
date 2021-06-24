package com.arrays.examples;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class ArrayPositiveNegativeRearrange {

	public static void main(String[] args) {
		int[] arr = { 2, 4, -6, 8, -5, -10 };

		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) { // if negative number found
				if (i != j) {
					int temp = arr[i];
					arr[i] = arr[j]; // swapping with leftmost positive
					arr[j] = temp;
				}
				j++;
			}
		}
		
		Arrays.stream(arr).forEach(System.out::print); //-6 -5 -10 8 4 2
		
		Map<Integer, String> map = new TreeMap<>();
		map.put(12, null);
		System.out.println(map);
	}
}
