package com.strings.example;

public class PreserveSpecialChars {

	public static void main(String[] args) {
		String str = "a!!!b.c.d,e'f,ghi";
		char[] charArray = str.toCharArray();
		
		int left =0;
		int right = charArray.length-1;
		
		while(left<right) {
			if(!Character.isAlphabetic(charArray[left])) {
				left ++;
			} else if(!Character.isAlphabetic(charArray[right])) {
				right --;
			} else {
				char temp = charArray[left];
				charArray[left] = charArray[right];
				charArray[right] = temp;
				left++;
				right--;
			}
		} 
		
		String reversed = new String(charArray);
		
		System.out.println(reversed); //i!!!h.g.f,e'd,cba
	}

}
