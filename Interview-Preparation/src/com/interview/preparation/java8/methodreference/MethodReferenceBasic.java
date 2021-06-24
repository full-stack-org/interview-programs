package com.interview.preparation.java8.methodreference;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceBasic {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		//Lambda Expressions
		intList.forEach(item -> System.out.println(item)); //1 2 3
		
		//Method Reference
		intList.forEach(System.out::println); //1 2 3
	}

}
