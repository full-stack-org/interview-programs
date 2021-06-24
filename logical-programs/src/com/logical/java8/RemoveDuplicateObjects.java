package com.logical.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RemoveDuplicateObjects {

	public static void main(String[] args) {
		Student student = new Student();
		student.setId(101);
		student.setName("Sunny");
		student.setSalary(29000);

		Student student1 = new Student();
		student1.setId(102);
		student1.setName("Bunny");
		student1.setSalary(5000);
		
		Student student2 = new Student();
		student2.setId(103);
		student2.setName("Munny");
		student2.setSalary(1000);

		List<Student> studentList = new ArrayList<>();
		studentList.add(student);
		studentList.add(student1);
		studentList.add(student2);

		//Sorting by name
		Map<String, List<Student>> sortedList = studentList.stream().collect(Collectors.groupingBy(Student::getName));
		
		sortedList.forEach((k,v) ->{
			v.forEach(data -> System.out.println("Name "+ k + " Empi Id " + data.getId() + " Emp Name " + data.getName()));
			/*
			 Name Munny Empi Id 103 Emp Name Munny
			 Name Bunny Empi Id 102 Emp Name Bunny
			 Name Sunny Empi Id 101 Emp Name Sunny

			 */
		});
		
		
	}

}
