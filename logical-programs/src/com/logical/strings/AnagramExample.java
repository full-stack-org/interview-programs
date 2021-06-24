package com.logical.strings;

import java.util.Arrays;

public class AnagramExample {

	public static void main(String[] args) {
		boolean test = isAnagram("Keep", "Peek");  
		System.out.println(test);
	}

	private static boolean isAnagram(String string, String string2) {
		char [] arr1 = string.toLowerCase().toCharArray();
		char [] arr2 = string2.toLowerCase().toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		return Arrays.equals(arr1, arr2);
	}

}
