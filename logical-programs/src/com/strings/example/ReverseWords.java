package com.strings.example;

import java.util.Arrays;

public class ReverseWords {

	public static void main(String[] args) {
		String str ="Java is Good";
		String uniqueArr[] = str.split(" ");
		
		String revWord = "";
		for(int rev = uniqueArr.length;rev>0;--rev) {
			revWord +=  uniqueArr[rev-1] +" ";
		}
		
		System.out.println(revWord);
		
		int space=0; 
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == ' ') {
				space ++ ;
			}
		}
		
		String arr[]=new String[space+1]; 
		Arrays.stream(arr).forEach(System.out::println);
	}

}
