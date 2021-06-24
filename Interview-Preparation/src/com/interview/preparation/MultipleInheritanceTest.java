package com.interview.preparation;

class A{
	
	void display() throws NullPointerException {
		System.out.println("In Parent class display method");
	}
}
class B{
	void display() throws IndexOutOfBoundsException{
		System.out.println("In child class display method");
	}
}


public class MultipleInheritanceTest extends A {
	
	//A a= new B

}
