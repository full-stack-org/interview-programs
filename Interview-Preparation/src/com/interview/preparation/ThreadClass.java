package com.interview.preparation;


public class ThreadClass implements Runnable {
	
	public void run() {
		System.out.println("thread is running...");
	}
	
	public static void main(String[] args) {
		ThreadClass threadClass = new ThreadClass();
		Thread thread = new Thread(threadClass);
		thread.start();
		thread.start();
		
		thread.setDaemon(true);

	}

}
