package com.strings.example;

public class MaxRepeatingCharacters {

	public static void main(String[] args) {
		String str = "HeGGo";

		System.out.println(maxRepeating(str)); //G
	}

	private static char maxRepeating(String str) {
		int len = str.length();
		int count = 0;

		char res = str.charAt(0);

		for (int i = 0; i < len; i++) {
			int cur_count = 1;
			for (int j = i + 1; j < len; j++) {
				if (str.charAt(i) != str.charAt(j))
					break;
				cur_count++;
			}

			// Update result if required
			if (cur_count > count) {
				count = cur_count;
				res = str.charAt(i);
			}
		}
		return res;
	}

}
