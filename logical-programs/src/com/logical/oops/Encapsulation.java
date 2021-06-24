package com.logical.oops;

class Student {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}

public class Encapsulation {

	public static void main(String[] args) {
		Student student = new Student();
		student.setId(10);

		System.out.println(student.getId()); //10
	}

}
