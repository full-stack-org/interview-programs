package com.interview.preparation.java8.methodreference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InstanceOrbitory {

	public static void main(String[] args) {

		List<String> personList = new ArrayList<>();

		personList.add("vicky");
		personList.add("poonam");
		personList.add("sachin");
		
		Collections.sort(personList,String::compareToIgnoreCase);
		
		personList.forEach(System.out::println); //poonam sachin vivky
	}

}
