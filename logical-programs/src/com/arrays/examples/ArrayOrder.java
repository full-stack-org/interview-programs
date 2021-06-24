package com.arrays.examples;

public class ArrayOrder {

	public static void main(String[] args) {
		int[] arrNumbers = { 1, 8, 3, 4, 9, 5, 6, 7, 2 };
		
		int arrLength = arrNumbers.length;
		
		for(int i=0;i<arrLength;i++) {
			for(int j=i+1;j<arrLength;j++) {
				if(arrNumbers[i]>arrNumbers[j]) {
					int temp = arrNumbers[i];
					arrNumbers[i] = arrNumbers[j];
					arrNumbers[j] = temp;
				}
			}
		}
		
		//Ascending
		for(int ascending: arrNumbers) {
			System.out.print(ascending + " ");//1 2 3 4 5 6 7 8 9
		}
		
		//Descending
		for(int desc=arrLength;desc>0;--desc) {
			System.out.print(desc + " "); //9 8 7 6 5 4 3 2 1 
		}

	}

}
