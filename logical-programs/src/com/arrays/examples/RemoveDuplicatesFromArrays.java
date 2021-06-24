package com.arrays.examples;

public class RemoveDuplicatesFromArrays {

	public static void main(String[] args) {

		int[] arrNumbers = { 1, 2, 3, 3, 4, 5, 5, 6, 7, 8,9 };
		int len = arrNumbers.length;
		len = removeDuplicate(arrNumbers, len);
		System.out.println(len); //9 based on length numbers will be printed
		for (int a = 0; a < len; a++) {
			System.out.print(arrNumbers[a] + " "); //1 2 3 4 5 6 7 8 9 
		}

	}

	private static int removeDuplicate(int[] arrNumbers, int num) {
		int b = 0;
		for (int a = 0; a < num - 1; a++) {
			if (arrNumbers[a] != arrNumbers[a + 1]) {
				arrNumbers[b++] = arrNumbers[a];
			}
		}
		arrNumbers[b++] = arrNumbers[num - 1];
		return b;
	}

}
