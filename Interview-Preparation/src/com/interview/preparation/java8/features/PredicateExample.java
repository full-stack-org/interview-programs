package com.interview.preparation.java8.features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

import com.interview.preparation.beans.Employee;

public class PredicateExample {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<>();
		
		Employee employee = new Employee();
		employee.setName("Sunny");
		employee.setSalary(3000);
		employeeList.add(employee);
		
		Employee employee1 = new Employee();
		employee1.setName("Bunny");
		employee1.setSalary(2000);
		employeeList.add(employee1);
		
		Employee employee2 = new Employee();
		employee2.setName("Munny");
		employee2.setSalary(1000);
		employeeList.add(employee2);
		
		BiPredicate<Employee, Employee> empBiPredicate = (salary,name)-> salary.getSalary() >2000 && !	name.getName().equals("Bunny");
		
		employeeList.forEach(emp->{
			if(empBiPredicate.test(emp, emp)){
				System.out.println(emp.getName()); //Sunny
			}
		});
		
	}

}
