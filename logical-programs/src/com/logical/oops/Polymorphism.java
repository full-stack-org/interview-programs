package com.logical.oops;

class C {

	public void display() {
		System.out.println("in Parent class Display");
	}
}

class D extends C {
	public void display() {
		System.out.println("in Parent class Display");
	}
}
public class Polymorphism {
	
	int sum(int i, int j) {
		return i + j;
	}
	
	int sum(int i, int j,int k) {
		return i + j + k;
	}

	public static void main(String[] args) {
		
		//Compile time Polymorphism
		Polymorphism polymorphism = new Polymorphism();
		System.out.println(polymorphism.sum(5, 10)); //15
		System.out.println(polymorphism.sum(4, 8,9)); //21
		
		//Runtime Polymorphisim
		C a = new C();
		a.display();
		D b = new D();
		b.display();
	}
}
