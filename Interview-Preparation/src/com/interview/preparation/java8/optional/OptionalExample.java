package com.interview.preparation.java8.optional;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		String[] str = new String[10];
		str[5] = "JAVA OPTIONAL CLASS EXAMPLE";

		Optional<String> empty = Optional.empty();
		System.out.println(empty); // Optional.empty

		Optional<String> value = Optional.of(str[5]);
		Optional<String> value1 = Optional.ofNullable(str[5]);
		System.out.println("With string value: " + value.filter((s) -> s.equals("And")));// With string value:
																							// Optional.empty
		System.out.println("With String value: " + value1.filter((s) -> s.equals("And")));// With string value:
																							// Optional.empty

		str[5] = null;
		// Optional<String> withNull = Optional.of(str[5]);
		Optional<String> withNull1 = Optional.ofNullable(str[5]);

		// System.out.println("With string value: " + withNull.filter((s) ->
		// s.equals("Java")));//java.lang.NullPointerException
		System.out.println("With Null Value: " + withNull1.filter((s) -> s.equals("Java"))); // With Null Value:
																								// Optional.empty

		System.out.println("Getting value: " + value.get()); // Getting value: JAVA OPTIONAL CLASS EXAMPLE
		System.out.println("Is value present: " + value.isPresent()); // Is value present: true
		System.out.println("orElse: " + value.orElse("Value is not present")); // orElse: JAVA OPTIONAL CLASS EXAMPLE
	}

}
