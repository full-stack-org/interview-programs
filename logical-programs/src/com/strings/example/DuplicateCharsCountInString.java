package com.strings.example;

public class DuplicateCharsCountInString {

	public static void main(String[] args) {
		String str = "abcdabcd";

		int count=0;
		for (int i = 0; i < str.length(); i++) {
			count =1;
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
					str = str.substring(0, j) + str.substring(j + 1);
				}
			}

			if (count > 1) {
				System.out.println(str.charAt(i) + " found " + count + " times"); //a found 2 times	b found 2 times	c found 2 times	d found 2 times

			}
		}
	}

}
