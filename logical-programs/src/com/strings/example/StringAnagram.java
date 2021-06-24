package com.strings.example;

public class StringAnagram {

	public static void main(String[] args) {
		String word = "java2blog";
		String anagram = "aj2vabgol";

		boolean isAnagram = isDataAnagram(word, anagram);
		System.out.println(isAnagram); //true
	}

	private static boolean isDataAnagram(String word, String anagram) {
		boolean value = false;
		if (word.length() != anagram.length()) {
			return false;
		} else {
			for (int i = 0; i < word.length(); i++) {
				for (int j = 0; j < anagram.length(); j++) {
					if (word.charAt(i) == anagram.charAt(j)) {
						anagram = anagram.substring(0, j) + anagram.substring(j + 1);
						System.out.println(anagram); //a2vabgol	2vabgol 2abgol 2bgol bgol gol go g

						break;
					}
				}
			}

			if (anagram.length() == 0) {
				value = true;
			} else {
				value = false;
			}
		}
		return value;
	}

}
