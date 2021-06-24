package com.test.java8;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Empl {
	int id;
	String name;
	int salary;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
public class AllPredefinedInterfaces {
	public static void main(String[] args) {
		List<Empl> emplList = new ArrayList<>();

		Empl empl1 = new Empl();
		empl1.setId(1);
		empl1.setName("Sunny");
		empl1.setSalary(100);
		Empl empl2 = new Empl();
		empl2.setId(2);
		empl2.setName("Bunny");
		empl2.setSalary(200);

		emplList.add(empl1);
		emplList.add(empl2);

		// Predicate
		Predicate<Empl> empPredicate = emp -> emp.getSalary() > 100;
		emplList.forEach(salData -> {
			if (empPredicate.test(salData)) {
				System.out.println("In Predicate: "+ salData.getName()); //In Predicate: Bunny
			}
		});
		
		//Function
		Function<Empl, Empl> empFunction = emp -> emp.getSalary() > 100 ? emp : new Empl();
		emplList.forEach(data -> {
			Empl empl = empFunction.apply(data);
			System.out.println("In Function: "+empl.getName()); //In Function: null	In Function: Bunny
		});
		
		//Consumer
		Consumer<List<Empl>> empConsumer = data -> data.forEach(salary -> salary.setSalary(salary.getSalary()*100));
		empConsumer.accept(emplList);
		
		emplList.forEach(data ->System.out.println("In Consumber: "+data.getSalary() + " "+ data.getName())); //In Consumer: 10000 Sunny In Consumer: 20000 Bunny
		
		//Supplier
		Supplier<LocalDateTime> dateSupplier = LocalDateTime::now;
		System.out.println("In Supplier: "+ dateSupplier.get());//In Supplier: 2021-05-08T11:25:29.237688200
		
	}

}
