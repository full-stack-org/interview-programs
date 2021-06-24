package com.logical.strings;

public class ReverseStringExamples {

	public static void main(String[] args) {
		String str = "Some Thing";

		String reverse = "";

		for (int i = str.length(); i > 0; --i) {
			reverse = reverse + (str.charAt(i-1));
		}
		
		System.out.println(reverse);//gnihT emoS

	}

}
