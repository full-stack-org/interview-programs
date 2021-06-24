package com.interview.preparation.java8.Streams;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import com.interview.preparation.beans.Employee;

public class MapSorting {

	public static void main(String[] args) {
		Map<Integer, Employee> unsortMap = new HashMap<>();

		Employee employee = new Employee();
		employee.setName("Sunny");
		employee.setSalary(2000);
		employee.setEmpId(102);
		unsortMap.put(employee.getEmpId(), employee);

		Employee employee1 = new Employee();
		employee1.setName("Bunny");
		employee1.setSalary(1000);
		employee1.setEmpId(100);
		unsortMap.put(employee1.getEmpId(), employee1);

		Employee employee2 = new Employee();
		employee2.setName("Munny");
		employee2.setSalary(5000);
		employee2.setEmpId(101);
		unsortMap.put(employee2.getEmpId(), employee2);

		LinkedHashMap<Integer, Employee> sortedMapByKey = new LinkedHashMap<>();
		
		//Sorting Employee in descending order
		unsortMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getEmpId).reversed()))
				.forEachOrdered(data -> sortedMapByKey.put(data.getKey(), data.getValue()));
		
		sortedMapByKey.forEach((k,v)->System.out.println(v.getEmpId())); //102 101 100

	}

}
