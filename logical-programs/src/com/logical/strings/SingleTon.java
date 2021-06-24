package com.logical.strings;

class SigleTonDemo {

	private static SigleTonDemo singleTon = new SigleTonDemo();

	private SigleTonDemo() {
	}

	public static SigleTonDemo getInstance() {
		return singleTon;
	}

	protected static void demoMethod() {
		System.out.println("demoMethod for singleton");
	}

}

public class SingleTon {

	public static void main(String[] args) {
		SigleTonDemo singleTon = SigleTonDemo.getInstance();
		singleTon.demoMethod(); //demoMethod for singleton

	}

}
