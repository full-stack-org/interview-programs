package com.logical.other;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNumbers {

	public static void main(String[] args) {

		var num= new int[] { 1, 2, 4, 9, 1, 2, 4, 3 };

		Map<Integer, Integer> dupMap = new HashMap<>();

		for (int i : num) {

			if (dupMap.containsKey(i)) {
				dupMap.put(i, dupMap.get(i) + 1);
			} else {
				dupMap.put(i, 1);
			}
		}
		
		dupMap.forEach((k,v) -> System.out.println(k +" Count "+ v)); //1 Count 2 2 Count 2	3 Count 1	4 Count 2 9 Count 1

	}

}
