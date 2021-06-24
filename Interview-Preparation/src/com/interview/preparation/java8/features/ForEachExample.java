package com.interview.preparation.java8.features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ForEachExample {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);

		list.stream().parallel().forEachOrdered(System.out::println); // 2 4 6 8 10

		list.stream().parallel().forEach(System.out::println); //6 10 8	2 4

		
		
		
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);

		List<Integer> listData = intList.stream().peek(System.out::println).collect(Collectors.toList());
		System.out.println(listData);// 1 2 3 [1, 2, 3]

		// Iterating over the stream
		intList.stream().forEach(num -> System.out.println(num)); // 123

		Set<Integer> intSet = new HashSet<>();
		intSet.add(1);
		intSet.add(2);
		intSet.add(3);

		// Iterating the Set
		intSet.forEach(System.out::println); // 123

		Map<Integer, String> map = new HashMap<>();
		map.put(101, "Sunny");
		map.put(102, "Bunny");

		// Iterating Map
		map.forEach((key, value) -> {
			System.out.println("Key " + key); // 101 102
			System.out.println("Value " + value); // Sunny Bunny
		});

	}

}
