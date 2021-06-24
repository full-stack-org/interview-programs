package com.strings.example;

public class StringUniqueChars {

	public static void main(String[] args) {
		//Unique means there should not be duplicate characters
		String s1 = "Sunny";
		String s2 = "noise";
		
		System.out.println(identifyUniqueString(s1)); //false
		System.out.println(identifyUniqueString(s2)); //true
	}

	private static boolean identifyUniqueString(String input) {
		for(int i=0; i<input.length();i++) {
			for(int j= i+1; j<input.length();j++) {
				if(input.charAt(i)==input.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}

}
