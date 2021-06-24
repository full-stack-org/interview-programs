package com.interview.preparation;

import com.interview.preparation.beans.Student;

public class OrderOfExecution {
	
	static{
		System.out.println("In Static Block");
	}
	
	OrderOfExecution(){
		System.out.println("In Default Constructor");
	}
	
	OrderOfExecution(int num){
		System.out.println("In Parameterized Constructor "+ num);
	}

	public void display() {
		System.out.println("In Instance Method");
	}

	public static void main(String[] args) {
		System.out.println("In Main method");
		
		new OrderOfExecution().display();
		
		new OrderOfExecution();
		new OrderOfExecution(5);
		
		
		
		Student student = new Student();
		student.setId(1);
		student.setName("Gopi");		
		getStudentInfo(student);
	}

	private static void getStudentInfo(Student student) {
		System.out.println(student.getId() +" "+ student.getName());
		
	}

}
