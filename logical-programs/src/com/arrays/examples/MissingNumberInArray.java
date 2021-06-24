package com.arrays.examples;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int[] arr={7,5,6,1,4,2};
		
		System.out.println(getMissingNumber(arr)); //3
	}

	private static int getMissingNumber(int[] arr) {
		int n = arr.length+1;
		int sum = n*(n+1)/2;
		int remainSum=0;
		
		for(int i=0;i<arr.length;i++) {
			remainSum += arr[i];
		}
		
		System.out.println("Sum is " + sum + " remain Sum " +remainSum);//Sum is 28 remain Sum 25
		return  sum-remainSum;
	}

}
