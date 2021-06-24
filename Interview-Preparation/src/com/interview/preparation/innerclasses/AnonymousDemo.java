package com.interview.preparation.innerclasses;

interface Age {
	int x = 21;

	void getAge();
}

public class AnonymousDemo {
	public static void main(String[] args) {
		Age age = new Age() {

			@Override
			public void getAge() {
				System.out.print("Age is " + x); //Age is 21
			}
		};
		age.getAge(); //Invoking the Method
	}
}
