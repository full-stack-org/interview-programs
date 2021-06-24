package com.interview.preparation;

import com.interview.preparation.beans.Student;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		Student student = null;
		try {
		System.out.println(student.getName());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception ");
		}
	}

}
