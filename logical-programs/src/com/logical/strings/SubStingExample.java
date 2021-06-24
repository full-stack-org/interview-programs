package com.logical.strings;

public class SubStingExample {

	public static void main(String[] args) {
		
		String name = "TestingFramework";
		
		System.out.println(name.substring(3, 8)); //tingF
		
		name = "Testing Frame Work";
		
		System.out.println(name.substring(0, 9)); //Testing F
		System.out.println(name.substring(1, 9)); //esting F
	}

}
