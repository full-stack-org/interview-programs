package com.arrays.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ShuffleArray {

	public static void main(String[] args) {
		Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7 };
		
		List<Integer> intList = Arrays.asList(intArray);
		
		//Approach 1
		Collections.shuffle(intList);
		intList.stream().forEach(System.out::print); //5 4 3 7 1 6 2
		
		//Approach 2
		Random rand = new Random();
		for(int i=0;i<intArray.length;i++) {
			int randomIndexToSwap = rand.nextInt(intArray.length);
			int temp = intArray[randomIndexToSwap];
			intArray[randomIndexToSwap] = intArray[i];
			intArray[i] = temp;
		}
		
		Arrays.stream(intArray).forEach(System.out::print);//5 2 1 6 3 7 4
		
	}

}
