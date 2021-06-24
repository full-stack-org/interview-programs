package com.interview.preparation;

abstract class Test{
	abstract void show();
	
	public void display() {
		System.out.println("In Parent class display method");
	}
}

public class AbstractClassInstantion extends Test {

	@Override
	void show() {
		System.out.println("Showing in implementation class");
	}

	public static void main(String[] args) {
		Test test = new AbstractClassInstantion();
		
		//Way to invoke the abstract class no abstract methods
		test.display(); //In Parent class display method
		test.show(); //Showing in implementation class
	}
	

}
