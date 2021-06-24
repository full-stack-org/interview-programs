package com.interview.preparation.java8.features;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {

		List<String> intList = new ArrayList<>();
		intList.add("1");
		intList.add("2");
		intList.add("3");

		StringJoiner commaJoiner = new StringJoiner(",");

		intList.forEach(num -> commaJoiner.add(num));
		System.out.println(commaJoiner);// 1,2,3

		StringJoiner joiner = new StringJoiner(",", "-", "$");
		intList.forEach(num -> joiner.add(num));
		System.out.println(joiner);// -1,2,3$

		System.out.println("Merge Method " + commaJoiner.merge(joiner));// Merge Method 1,2,3,1,2,3
		System.out.println("Length Method " + commaJoiner.length()); // Length Method 11

		StringJoiner emptyJoiner = new StringJoiner(",");

		System.out.println("Setting empty value " + emptyJoiner.setEmptyValue("Setting Empty Value"));//Setting empty value Setting Empty Value

	}

}
