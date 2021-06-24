package com.logical.strings;

public class ReverseWordsWithOutUtility {

	public static void main(String[] args) {
		String s = "i like this program very much ";
		char[] p = reverseWords(s.toCharArray());
		System.out.print(p);
	}

	private static char[] reverseWords(char[] charArray) {
		int start = 0;
		for (int end = 0; end < charArray.length; end++) {
			if (charArray[end] == ' ') {
				reverse(charArray, start, end);
				start = end + 1;
			}
		}
		// Reverse the last word
		reverse(charArray, start, charArray.length - 1);

		// Reverse the entire String
		reverse(charArray, 0, charArray.length - 1);

		return charArray;
	}

	static void reverse(char str[], int start, int end) {
// Temporary variable
// to store character
		char temp;

		while (start <= end) {
// Swapping the first
// and last character
			temp = str[start];
			str[start] = str[end];
			str[end] = temp;
			start++;
			end--;
		}
	}

}
