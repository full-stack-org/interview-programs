package com.arrays.examples;

public class CommonElementsInArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 4, 5 };
		int b[] = { 1, 3, 5 };
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if(a[i] == b[j]) {
					System.out.print(a[i] + " "); //1 5
				}
			}
		}

	}

}
