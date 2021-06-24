package com.interview.preparation.java8.methodreference;

@FunctionalInterface
interface Say{
	void sayHello();
}

public class InstanceMethodReference {
	
	public void sayHi() {
		System.out.println("Invoking Instance Method");
	}

	public static void main(String[] args) {
		
		InstanceMethodReference instanceMethodReference = new InstanceMethodReference();
		
		Say say = instanceMethodReference::sayHi;
		say.sayHello(); //Invoking Instance Method

	}

}
