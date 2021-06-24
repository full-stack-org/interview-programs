package com.interview.preparation;


public class OverloadingProtectedMethods {
	
	 void display(int num) {
		System.out.println("In Display 1 " +num);
	}
	
	 void display(int num,String name) {
		System.out.println("In Display 2 " +num +" " + name);
	}

	public static void main(String[] args) {
		OverloadingProtectedMethods inheritance = new OverloadingProtectedMethods();
		inheritance.display(2);
		inheritance.display(1, "Test");
	}
}
