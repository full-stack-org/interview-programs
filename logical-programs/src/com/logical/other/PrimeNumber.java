package com.logical.other;

public class PrimeNumber {

	public static void main(String[] args) {
		
		//System.out.println(isPrimeNumber(10)); //false
		System.out.println(isPrimeNumber(11)); //true
	}

	public static boolean isPrimeNumber(int number) {

		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
