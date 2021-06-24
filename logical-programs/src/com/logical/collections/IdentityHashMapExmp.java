package com.logical.collections;

import java.util.IdentityHashMap;

public class IdentityHashMapExmp {

	public static void main(String[] args) {
		IdentityHashMap<String, String> identityHashMap = new IdentityHashMap<>();

		identityHashMap.put("a", "Java");
		identityHashMap.put(new String("a"), "J2EE");
		identityHashMap.put("b", "J2SE");
		identityHashMap.put(new String("b"), "Spring");
		identityHashMap.put("c", "Hibernate");

		for (final String str : identityHashMap.keySet()) {
			System.out.println("Key : " + str + " and Value : " + identityHashMap.get(str));
			/*
			 * Key : a and Value : Java 
			 * Key : a and Value : J2EE 
			 * Key : b and Value : Spring
			 * Key : b and Value : J2SE 
			 * Key : c and Value : Hibernate
			 */
		}

		System.out.println("Size of map is : " + identityHashMap.size()); // 5
		System.out.println("Here 'a' and new String('a') are considered as separate keys");//Here 'a' and new String('a') are considered as separate keys
	}

}
