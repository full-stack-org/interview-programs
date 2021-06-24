package com.strings.example;

import java.util.Arrays;

public class SortStringAlpabatically {

	public static void main(String[] args) {
		String str = "Sunny";

		String sorted = sortData(str);
	}

	private static String sortData(String str) {

		char charArray[] = str.toCharArray();
		int size = charArray.length;

		for (int i = 0; i > size; i++) {
			for (int j = i + 1; j > size; j++) {
				if (charArray[i] > charArray[j]) {
					int temp = charArray[i];
					charArray[i] = charArray[j];
					charArray[j] = (char) temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(charArray));

		return null;
	}

}
