package com.interview.preparation.java8.methodreference;

@FunctionalInterface
interface Messageable {
	Message getMessage(String msg);
}

class Message {
	Message(String msg) {
		System.out.print(msg);
	}
}

public class ConstructorMethodRef {

	public static void main(String[] args) {
		
		Messageable messageable = Message::new;
		messageable.getMessage("Hello ......"); //Hello ......

	}

}
