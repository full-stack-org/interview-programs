package com.interview.preparation.java8.features;


@FunctionalInterface
interface Functional{
	public String getName(String name);
	
	@Override
	int hashCode();
	
	@Override
	String toString();
	
}

public class FunctionalInterfaceExampe {
	public static void main(String[] args) {
		Functional functional = name -> name;
		System.out.println(functional.getName("test")); //test
		
	}

}
