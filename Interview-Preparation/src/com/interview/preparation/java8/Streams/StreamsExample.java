package com.interview.preparation.java8.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsExample {

	public static void main(String[] args) {
		
		Stream<Integer> intStream = Stream.of(1,2,3,4,5);
		intStream.forEach(System.out::println); //1 2 3 4 5
		
		Stream<String> stringStream = Stream.of("A","B","C");
		stringStream.forEach(System.out::println); //A B C
		
		int [] intArr = new int[] {1,2,3,4};
		
		//Array to Stream
		IntStream arayStream = Arrays.stream(intArr);
		arayStream.forEach(System.out::println); //1 2 3 4
		
		List<String> list = new ArrayList<>();
		list.add("Abc");
		list.add("Bcd");
		
		//List to Stream
		Stream<String> listToStream = list.stream();
		listToStream.forEach(System.out::println); //Abc Bcd
		
		Set<String> set = new HashSet<>();
		set.add("Abc");
		set.add("Bcd");
		
		//Set to Stream
		Stream<String> setToStream = set.stream();
		setToStream.forEach(System.out::println); //Abc Bcd
		
		Map<Integer, String> map = new HashMap<>();
		map.put(101, "Sunny");
		map.put(102, "Bunny");
		
		//Map to Stream
		Stream<Map.Entry<Integer, String>> mapToStream = map.entrySet().stream();
		
		//Iterating Map
		mapToStream.forEach(data ->{
			System.out.println(data.getKey()); //101 102
			System.out.println(data.getValue()); //Sunny Bunny
		});
		
	}

}
