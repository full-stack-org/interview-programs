package com.interview.preparation.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(101, "Sunny");
		map.put(102, "Bunny");

		// Iterator
		Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, String> entry = itr.next();
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}

		// For Loop
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}

		// forEach(action) method to iterate map
		map.forEach((k, v) -> System.out.println("Key = " + k + ", Value = " + v));
		
		List<String> list = new ArrayList<>();
		Set<String> set = new HashSet<>();
	}

}
