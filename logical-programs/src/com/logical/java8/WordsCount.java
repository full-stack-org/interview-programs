package com.logical.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordsCount {

	public static void main(String[] args) {
		
		String str = "aba,abc,aba,abc";
		List<String> list = Arrays.asList(str.split(","));
		
		//Case 1
		Map<String, Integer> countMap = list.stream().collect(Collectors.toMap(w -> w,w->1, Integer::sum));
		countMap.forEach((k,v)->System.out.println(k + " "+ v)); //aba 2 abc 2
		
		//Case 2
		Map<String, Long> countMap2 = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		countMap2.forEach((k,v)->System.out.println(k + " "+ v));  //aba 2 abc 2
		
		
		
		
	}

}
