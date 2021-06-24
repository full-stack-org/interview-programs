package com.interview.preparation.java8.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.interview.preparation.beans.Employee;

public class StreamsCollectionExample {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<>();

		Employee employee = new Employee();
		employee.setName("Sunny");
		employee.setSalary(2000);
		employeeList.add(employee);

		Employee employee1 = new Employee();
		employee1.setName("Bunny");
		employee1.setSalary(1000);
		employeeList.add(employee1);

		Employee employee2 = new Employee();
		employee2.setName("Munny");
		employee2.setSalary(5000);
		employeeList.add(employee2);

		//Added comparision logic on single fields
		employeeList.sort(Comparator.comparing(Employee::getName));

		employeeList.forEach(emp -> System.out.println(emp.getName() + " " + emp.getSalary())); // Bunny 1000 Munny 5000
																								// Sunny 2000
		//Added comparision logic on multiple fields
		employeeList.sort(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName));
		employeeList.forEach(emp -> System.out.println(emp.getName() + " " + emp.getSalary())); // Bunny 1000 Sunny 2000
																								// Munny 5000
	}

}
