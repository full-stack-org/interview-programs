package com.interview.preparation.java8.Streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.interview.preparation.beans.Employee;

public class StreamsDecending {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(9);
		intList.add(2);
		
		Collections.reverse(intList);
		
		System.out.println(intList);
		
		List<Integer> nwList = intList.stream().sorted().collect(Collectors.toList());
		
		System.out.println(nwList);
		
		List<Employee> empList = new ArrayList<>();
		Employee employee = new Employee();
		employee.setName("Bunny");
		employee.setSalary(1000);
		employee.setEmpId(100);
		empList.add(employee);
		
		Employee employee1 = new Employee();
		employee1.setName("Sunny");
		employee1.setSalary(2000);
		employee1.setEmpId(102);
		empList.add(employee1);

		Employee employee2 = new Employee();
		employee2.setName("Munny");
		employee2.setSalary(5000);
		employee2.setEmpId(101);
		empList.add(employee2);
		
		//Sorting Employee in descending order
		empList.sort(Comparator.comparing(Employee::getEmpId).reversed());
		
		empList.forEach(empData -> System.out.println(empData.getEmpId()));
		
	}

}
