package com.interview.preparation;

import java.io.Serializable;

class Ser_1 {

	void display(int num) {
		System.out.println("In Display 1 " + num);
	}
}

class Ser_2 extends Ser_1 implements Serializable{
	private static final long serialVersionUID = 5973259254175630541L;

	void display(int num) {
		System.out.println("In Display 1 " + num);
	}
}

public class SerilizeException {

	public static void main(String[] args) {

		Ser_1 ser1 =new Ser_1();
		ser1.display(1); //In Display 1 1
		

		Ser_2 ser2 =new Ser_2();
		ser2.display(1); //In Display 1 1
	}

}
