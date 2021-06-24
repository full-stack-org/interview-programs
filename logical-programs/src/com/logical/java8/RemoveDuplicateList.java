package com.logical.java8;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateList {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(3);
		intList.add(3);
		intList.add(2);
		intList.add(1);
		
		intList.stream().distinct().forEach(System.out::println); //1 3 2
	}

}
