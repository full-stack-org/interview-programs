package com.interview.preparation.innerclasses;

class Outer1 {
	public void display() {
		class Inner1 {
			public void show() {
				System.out.println("In Inner class display method");

			}
		}

		// Creating the Inner class object outside the Inner class and inside display
		// method
		Inner1 inner1 = new Inner1();
		inner1.show();
	}
}

public class LocalInnerClass {

	public static void main(String[] args) {

		Outer1 outer1 = new Outer1();
		outer1.display(); // In Inner class display method

	}

}
