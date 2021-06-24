package com.datastructure.examples;

class Node {
	int data;
	Node next;

	public void displayNodeData() {
		System.out.println("{ " + data + " } ");
	}
}

public class SingleLinkedList {

	private Node head;

	public void insert(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
	}

	public Node delete() {
		Node temp = head;
		head = head.next;
		return temp;
	}

	public void printLinkedList() {
		System.out.println("Printing LinkedList (head --> last) ");
		Node current = head;
		while (current != null) {
			current.displayNodeData();
			current = current.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {

		SingleLinkedList singleLinkedList = new SingleLinkedList();
		singleLinkedList.insert(2);
		singleLinkedList.insert(5);
		singleLinkedList.printLinkedList();
		
		singleLinkedList.delete();
		singleLinkedList.printLinkedList();

	}

}
