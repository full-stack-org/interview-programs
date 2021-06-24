package com.interview.preparation.java8.defaultstatic;

interface TestInterface1 {
	default void show() {
		System.out.println("Default TestInterface1");
	}
}

interface TestInterface2 {
	default void show() {
		System.out.println("Default TestInterface2");
	}
}

public class DefaultMethod implements TestInterface1, TestInterface2 {

	public static void main(String[] args) {
		DefaultMethod defaultMethod = new DefaultMethod();
		defaultMethod.show();
	}

	public void show() {
		TestInterface1.super.show(); //Default TestInterface1
		TestInterface2.super.show(); //Default TestInterface2
	}

}
