package com.logical.other;

public class FactorialExample {

	public static void main(String[] args) {
		
		int fact = 1;
		int input = 3;

		for (int i = 1; i <= input; i++) {
			fact = fact * i;
		}

		System.out.println(fact); // 6
	}

}
