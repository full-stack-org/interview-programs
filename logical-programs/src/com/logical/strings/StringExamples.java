package com.logical.strings;

public class StringExamples {

	public static void main(String[] args) {
		int number = 126754;
		int reverse = 0;

		while (number != 0) {
			reverse = (reverse * 10) + (number % 10);
			number = number / 10;
		}

		System.out.println(reverse);//457621
	}
}
