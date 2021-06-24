package com.strings.example;

public class PalindromExample {

	public static void main(String[] args) {
		String str = "malayalam";
		
		boolean palindrom = true;
		
		String reverse ="";
		for(int j=str.length();j>0;--j) {
			reverse = reverse + str.charAt(j-1);
		}
		
		if(str.equalsIgnoreCase(reverse)) {
			System.out.println("Its Palindrom"); //Its Palindrom
		} else {
			System.out.println("It's not palindrom");
		}
		
		
		
		 //Iterate the string forward and backward, compare one character at a time till middle of the string is reached   
		for(int i=0;i < str.length()/2;i++) {
			if(str.charAt(i)!= str.charAt(str.length()-i-1)) {
				palindrom=false;
				break;
			}
		}
		
		if(palindrom) {
			System.out.println("Its Palindrom"); //Its Palindrom
		} else {
			System.out.println("It's not palindrom");
		}
	}

}
