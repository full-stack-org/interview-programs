package com.logical.oops;

class A {

	public void display(){
		System.out.println("in Parent class Display");
	}
}

class B extends A {
	public  void display() throws NullPointerException{
		System.out.println("in Parent class Display");
	}
}

public class Inheritance {
	
	final int sum(int i,int j) {
		return i + j;
	}
	
	final int sum(int i,int j,int k) {
		return i + j + k;
	}

	public static void main(String[] args) throws Exception {
		
		Inheritance inheritance = new Inheritance();
		
		System.out.println(inheritance.sum(2, 3));
		System.out.println(inheritance.sum(2, 3,9));

		A a = new A();
		a.display();

		B b = new B();
		b.display();
		
		
		String s1="Abc";
		String s2="abc";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
	}

}
