package com.logical.other;

import java.util.HashMap;
import java.util.Map;

public class DuplicateChars {

	public static void main(String[] args) {

		String name = "SunnySy";

		Map<Character, Integer> dupCountMap = new HashMap<>();

		char[] nameArr = name.toCharArray();

		for (char c : nameArr) {
			if (dupCountMap.containsKey(c)) {
				dupCountMap.put(c, dupCountMap.get(c) + 1);
			} else {
				dupCountMap.put(c, 1);
			}
		}
		
		dupCountMap.forEach((k,v) -> System.out.println(k + " Count " + v)); //S Count 2 u Count 1 	y Count 2 n Count 2
	}

}
