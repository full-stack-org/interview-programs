package com.interview.preparation.innerclasses;

class Outer2 {
	public void display() {
		System.out.println("In Outer class display method");
	}

	static class Inner {
		public void display() {
			System.out.println("In Inner class display method");
		}

	}
}


public class StaticInnerClass {

	public static void main(String[] args) {
		Outer2 outer = new Outer2();
		outer.display();//In Outer class display method
		
		//Invoking the Inner class with the help of Outer class.
		Outer2.Inner inner =  new Outer2.Inner();
		inner.display(); ////In Inner class display method

	}

}
