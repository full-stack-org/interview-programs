package com.datastructure.examples;

class DoubleNode {
	int data;
	DoubleNode previous;
	DoubleNode next;

	public DoubleNode(int data) {
		this.data = data;
	}
}

public class DoubleLinkedList {
	DoubleNode head = null;
	DoubleNode tail = null;

	public void insert(int data) {
		DoubleNode newNode = new DoubleNode(data);
		if (head == null) {
			head = tail = newNode;
			head.previous = null;
			tail.next = null;
		} else {
			tail.next = newNode;
			newNode.previous = tail;
			tail = newNode;
			tail.next = null;
		}
	}

	public void display() {
		DoubleNode current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
	}

	public static void main(String[] args) {
		DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
		doubleLinkedList.insert(25);
		doubleLinkedList.display();
	}

}
