package com.arrays.examples;

public class SecondLargestInArray {

	public static void main(String[] args) {
		int[] arr = { 7, 5, 6, 1, 4, 2 };
		
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j =i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					 temp = arr[i];
					 arr[i]=arr[j];
					 arr[j]= temp;
				}
			}
		}
		
		System.out.println("Second Largest " + arr[arr.length-2]);//Second Largest 6
		System.out.println("Third Largest " + arr[arr.length-3]);//Third Largest 5

	}

}
