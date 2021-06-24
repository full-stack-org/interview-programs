package com.datastructure.examples;

public class MyStack {

	private int maxSize;
	private long[] stackArray;
	private int top;

	public MyStack(int s) {
		maxSize = s;
		stackArray = new long[maxSize];
		top = -1;
	}

	public void push(long j) {
		stackArray[++top] = j;
	}

	public long pop() {
		return stackArray[top--];
	}
	
	  public boolean isEmpty() {
	      return (top == -1);
	   }

	public static void main(String[] args) {

		MyStack theStack = new MyStack(10);
		theStack.push(90);
		theStack.push(60);
		theStack.push(30);
		
		 while (!theStack.isEmpty()) {
	         long value = theStack.pop();
	         System.out.print(value);
	         System.out.print(" ");
	      }
	      System.out.println("");

	}

}
