package com.logical.strings;

import java.util.HashMap;

public class RepeatedAndNonRepeatedCharInString {

	public static void main(String[] args) {

		String inputString = "Hello";

		HashMap<Character, Integer> charCountMap = new HashMap<>();

		char[] strArray = inputString.toCharArray();

		for (char c : strArray) {
			if (charCountMap.containsKey(c)) {

				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}

		for (char c : strArray) {
			if (charCountMap.get(c) == 1) {
				System.out.println("First Non-Repeated Character In '" + inputString + "' is '" + c + "'"); //First Non-Repeated Character In 'Hello' is 'H'

				break;
			}
		}

		for (char c : strArray) {
			if (charCountMap.get(c) > 1) {
				System.out.println("First Repeated Character In '" + inputString + "' is '" + c + "'"); //First Repeated Character In 'Hello' is 'l'

				break;
			}
		}
	}

}
