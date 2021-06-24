package com.logical.oops;

import java.util.ArrayList;
import java.util.List;

abstract class Test {
	abstract String displayMessage(String name);
	
	public Test() {}

	abstract void displayMessage();
}

public class Abstraction extends Test {
	public static void main(String[] args) {
		
		List<Long> longList = new ArrayList<>(10000000);
		long maxValue = 10000000;

		long startTime = System.currentTimeMillis();

		for (long l = 0; l < maxValue; l++) {
			longList.add(l);
		}

		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime); //632
	}

	String displayMessage(String name) {
		return name;
	}

	void displayMessage() {
		System.out.println("Implementation for void method"); // Implementation for void method
	}
}
