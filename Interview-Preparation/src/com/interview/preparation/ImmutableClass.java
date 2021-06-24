package com.interview.preparation;

public final class ImmutableClass {

	private final String pancardNumber;

	public ImmutableClass(String pancardNumber) {
		this.pancardNumber = pancardNumber;
	}

	public String getPancardNumber() {
		return pancardNumber;
	}
	
	public static void main(String[] args) {
		ImmutableClass immutableClass = new ImmutableClass("1234567687");
		System.out.println(immutableClass.getPancardNumber()); //1234567687
	}

}
