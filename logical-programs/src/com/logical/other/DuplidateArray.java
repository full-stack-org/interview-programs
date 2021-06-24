package com.logical.other;

import java.util.Arrays;

public class DuplidateArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 5, 4, 5, 4, 1 };

		Arrays.stream(arr).sorted().distinct().forEach(System.out::println); //1 2 3 4 5
	}

}
