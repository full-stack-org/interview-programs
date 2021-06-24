package com.interview.preparation.java8.features;

interface Test {
	void display(int i, int j, int k);
}

public class LamdaExpressions {

	public static void main(String[] args) {

		//With out Lambda Expression
		new Thread(new Runnable() {
			@Override
			public void run() {

				System.out.println("Starting thread in old way");
			}
		}).start(); //Starting thread in old way

		//With Lambda Expression
		new Thread(() -> System.out.println("In Lambda Expression way")).start();//In Lambda Expression way
	}

}
