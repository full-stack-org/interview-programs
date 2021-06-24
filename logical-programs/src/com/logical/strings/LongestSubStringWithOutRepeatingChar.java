package com.logical.strings;

import java.util.LinkedHashMap;

public class LongestSubStringWithOutRepeatingChar {

	public static void main(String[] args) {

		String input = "javaconceptoftheday";

		char[] charArray = input.toCharArray();

		String longestSubstring = null;

		LinkedHashMap<Character, Integer> charPosMap = new LinkedHashMap<>();

		for (int i = 0; i < charArray.length; i++) {
			char ch = charArray[i];

			if (!charPosMap.containsKey(ch)) {
				charPosMap.put(ch, i);
			}
			// If ch is already present in charPosMap, reposioning the cursor i to the
			// position of ch and clearing the charPosMap
			else {
				i = charPosMap.get(ch);
				charPosMap.clear();
			}

			longestSubstring = charPosMap.keySet().toString();
		}

		System.out.println("The longest substring : " + longestSubstring); // The longest substring : [o, f, t, h, e, d, a, y]
	}
}
