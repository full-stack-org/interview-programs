package com.interview.preparation.java8.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class NaturalSortingExample {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		stringList.add("Abc");
		stringList.add("Ade");
		stringList.add("Acd");
		
		List<String> sortedList = stringList.stream().sorted().collect(Collectors.toList());
		
		sortedList.forEach(System.out::println); //Abc Acd Ade
		
		List<Integer> randomNumbers = Stream.generate(() -> (new Random()).nextInt(100))
                .limit(10)
                .collect(Collectors.toList());
		System.out.println(randomNumbers); //[89, 44, 95, 5, 85, 80, 15, 32, 25, 10]
		
		
		List<String> list = Arrays.asList("node", "java", "c++", "react", "javascript");
		Stream<String> stream = StreamSupport.stream(list.spliterator(), false);
		System.out.println(stream.collect(Collectors.toList()));//[node, java, c++, react, javascript]
        
	}

}
