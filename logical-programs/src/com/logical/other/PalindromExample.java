package com.logical.other;

public class PalindromExample {

	public static void main(String[] args) {

		String data = "aba";

		//Solution 1
		System.out.println(new StringBuilder().append(data).reverse().toString().equals(data));

		// Second Approach
		boolean isPalindrom = checkPalindrom(data);
		System.out.println(isPalindrom); // true
	}

	private static boolean checkPalindrom(String input) {
		String reverse = "";
		for (int i = input.length(); i > 0; --i) {
			reverse = reverse + (input.charAt(i - 1));
		}
		return reverse.equals(input);
	}

}
