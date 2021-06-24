package com.logical.other;

public class Fibonacci {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int counter = 0;
		int input = 5;

		while (counter < input) {
			
			System.out.print(num1 + " "); //0 1 1 2 3 

			int num3 = num2 + num1;
			num1 = num2;
			num2 = num3;
			counter = counter + 1;
		}
	}

}
