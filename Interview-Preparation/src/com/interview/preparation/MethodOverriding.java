package com.interview.preparation;
class Parent{
	
	 void display() throws NullPointerException {
		System.out.println("In Parent class display method");
	}
}
class Child extends Parent{
	  void display() throws IndexOutOfBoundsException{
		System.out.println("In child class display method");
	}
}
public class MethodOverriding {
	
	public static void main(String[] args) {
		Parent parent =new Parent();
		parent.display();	//In Parent class display method
		
		Child child = new Child();
		child.display(); //In child class display method
		
		Parent p1 = new Child();
		p1.display(); //In child class display method
		
		//Child c1 = new Parent(); // Compile error Type mismatch: cannot convert from Parent to Child
		
		//Child c2 = (Child) new Parent ();
		//c2.display(); //During execution will get ClassCasteException
		
		try {
			int i = 34/0;
		} catch (Exception e) {
			System.out.println(e.getMessage()); /// by zero
			System.exit(-1);
		} finally {
			System.out.println("in Finally");
		}
	}

}
