package com.logical.other;

public class MySwapingTwoNumbers {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;

		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println(x + " " + y); //20 10
	}

}
