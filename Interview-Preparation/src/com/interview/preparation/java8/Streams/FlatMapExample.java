package com.interview.preparation.java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

	public static void main(String[] args) {

		 // Creating a list of Prime Numbers
        List<Integer> primeNumbers = Arrays.asList(5, 7, 11,13);
          
        // Creating a list of Odd Numbers
        List<Integer> oddNumbers = Arrays.asList(1, 3, 5);
          
        // Creating a list of Even Numbers
        List<Integer> evenNumbers = Arrays.asList(2, 4, 6, 8);
  
        List<List<Integer>> listOfListofInts =
                Arrays.asList(primeNumbers, oddNumbers, evenNumbers);
        
        System.out.println("The Structure before flattening is : " +
                listOfListofInts); //The Structure before flattening is : [[5, 7, 11, 13], [1, 3, 5], [2, 4, 6, 8]]
    
        //Using Flat Map
        List<Integer> afterFaltMap = listOfListofInts.stream().flatMap(num -> num.stream()).collect(Collectors.toList());
        System.out.println("After Flattern "+ afterFaltMap); //After Flattern [5, 7, 11, 13, 1, 3, 5, 2, 4, 6, 8]
    
        
	}

}
