package com.logical.other;

import java.util.PriorityQueue;

public class PeekAndPoll {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("Welcome");
		queue.add("To");
		queue.add("Geeks");

		//Poll
		System.out.println("The element at the head of the" + " queue is: " + queue.poll()); //Geeks
		System.out.println("Final PriorityQueue: " + queue); //[To, Welcome]
		
		//Peek
		System.out.println("The element at the head of the" + " queue is: " + queue.peek()); //To
		System.out.println("Final PriorityQueue: " + queue); //[To, Welcome]
	}

}
