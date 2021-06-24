package com.logical.other;

public class MyStringToNumber {

	public static void main(String[] args) {
		String input = "123456";
		char[] chArr = input.toCharArray();
		int sum = 0;
		
		// get ascii value for zero
		int zeroAscii = (int) '0';
		System.out.println(zeroAscii); //48
		for (char c : chArr) {
			int tmpAscii = (int) c;
			sum = (sum * 10) + (tmpAscii - zeroAscii);
		}
		
		System.out.println(sum); // 123456
	}

}
