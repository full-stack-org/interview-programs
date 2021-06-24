package com.strings.example;

public class StringReverse {

	public static void main(String[] args) {
		String str = "abcd";
		char[] charArray = str.toCharArray();
		String reverse = "";
		
		for(int i = charArray.length;i>0;--i) {
			reverse = reverse + charArray[i-1];
		}
		
		System.out.println(reverse); //dcba
	}

}
