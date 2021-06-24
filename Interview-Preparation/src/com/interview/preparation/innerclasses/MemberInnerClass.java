package com.interview.preparation.innerclasses;

class Outer {
	public void display() {
		System.out.println("In Outer class display method");
	}

	class Inner {
		public void display() {
			System.out.println("In Inner class display method");
		}

	}
}

public class MemberInnerClass {

	public static void main(String[] args) {
		
		Outer outer = new Outer();
		outer.display();//In Outer class display method
		
		//Invoking the Inner class with the help of Outer class.
		Outer.Inner inner = new Outer().new Inner();
		inner.display();//In Inner class display method

	}

}
