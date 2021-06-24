package com.logical.strings;

public class ReverseStringPreserveWord {

	public static void main(String[] args) {
		String str = "India Is my country";

		// Approach 1
		System.out.println(new StringBuilder().append(str).reverse());

		// Approach 2
		char[] inputArray = str.toCharArray();
		char[] result = new char[inputArray.length];

		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] == ' ') {
				result[i] = ' ';
			}
		}

		int j = result.length - 1;

		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] != ' ') {
				if (result[j] == ' ') {
					j--;
				}
				result[j] = inputArray[i];
				j--;
			}
		}

		System.out.println(str + " --> " + String.valueOf(result)); // India Is my country --> yrtnu oc ym sIaidnI
	}

}
