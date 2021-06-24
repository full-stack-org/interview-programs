package com.interview.preparation;

class Super {
	public static void main(String args[]) {
		System.out.println("This is the main method of the superclass");
	}
}

class Sub extends Super {
	public static void main(String args[]) {
		System.out.println("This is the main method of the subclass");
	}
}

public class MainOverridingExample {
	public static void main(String args[]) {
	      MainOverridingExample obj = new MainOverridingExample();
	      Super.main(args);
	      Sub.main(args);
	   }
}
