package com.logical.other;

public class MyDeadlock {

	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = "UNIX";

		Thread trd1 = new Thread("My Thread 1") {
			public void run() {
				while (true) {
					synchronized (str1) {
						synchronized (str2) {
							System.out.println(str1 + str2);
						}
					}
				}
			}
		};

		Thread trd2 = new Thread("My Thread 2") {
			public void run() {
				while (true) {
					synchronized (str2) {
						synchronized (str1) {
							System.out.println(str2 + str1);
						}
					}
				}
			}
		};

		trd1.start();
		trd2.start();

	}

}
