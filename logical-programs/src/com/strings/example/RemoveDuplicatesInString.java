package com.strings.example;

public class RemoveDuplicatesInString {

	public static void main(String[] args) {
		String input ="Sunny";
		
		String unqueStr ="";
		for(int i=0;i<input.length();i++) {
			boolean duplicateFound= false;
			for(int j=i+1;j<input.length();j++) {
				if(input.charAt(i)== input.charAt(j)) {
					duplicateFound = true;
					break;
				}
			}
			
			if(!duplicateFound) {
				unqueStr = unqueStr+input.charAt(i);
			}
		}
		
		System.out.println(unqueStr); //abcd
		
	}

}
