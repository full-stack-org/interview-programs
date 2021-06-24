package com.interview.preparation.java8.methodreference;

import java.util.function.BiFunction;

interface Calculate{
	public static int multiply(int i, int j) {
		return i * j;
	}
}

public class StaticMethodRef implements Calculate {

	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, Integer> biFunction = Calculate::multiply;
		System.out.println(	biFunction.apply(5, 7));//35
	}

}
