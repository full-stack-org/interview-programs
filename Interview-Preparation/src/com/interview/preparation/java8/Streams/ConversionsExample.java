package com.interview.preparation.java8.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConversionsExample {

	public static void main(String[] args) {

		List<String> stringList = new ArrayList<>();
        stringList.add("Java");
        stringList.add("C++");
        stringList.add("JavaScript");
        
        String [] strArr = stringList.stream().toArray(String[]::new);
        System.out.println(strArr);
        
        String [] strData = new String[] {"A","B","C"};
        List<String> data = Arrays.asList(strData);
        System.out.println(data); //[A, B, C]
        
	}

}
