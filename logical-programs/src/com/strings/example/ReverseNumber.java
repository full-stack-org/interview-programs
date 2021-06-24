package com.strings.example;

public class ReverseNumber {

	public static void main(String[] args) {
		int number = 123;
		int reverse =0;
		
		while(number != 0) {
			 reverse = reverse * 10 + number%10;
			number = number/10;
		}
		
		System.out.println(reverse);
	}

}
