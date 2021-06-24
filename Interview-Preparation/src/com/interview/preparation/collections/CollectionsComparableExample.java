package com.interview.preparation.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
	int rollno;
	String name;
	@Override
	public int compareTo(Employee arg0) {
		return Integer.compare(rollno, arg0.getRollno());
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
public class CollectionsComparableExample {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		Employee employee = new Employee();
		employee.setName("Test");
		employee.setRollno(103);
		Employee employee1 = new Employee();
		employee1.setName("Sunny");
		employee1.setRollno(102);
		list.add(employee);
		list.add(employee1);
		Collections.sort(list);

		for(Employee emp: list) {
			System.out.println(emp.getRollno() + " " + emp.getName());//102 Sunny103 Test
		}
	}
}
