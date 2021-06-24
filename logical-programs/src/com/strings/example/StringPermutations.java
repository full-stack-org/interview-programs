package com.strings.example;

public class StringPermutations {

	public static void main(String[] args) {
		String input ="abc";
		printPermutations(input,"");
	}

	private static void printPermutations(String input,String ans) {
		if (input.length() == 0) {
            System.out.print(ans + " "); //abc acb bac bca cab cba 
            return;
        }
		
		for(int i=0;i<input.length();i++) {
			String data = input.substring(0,i)+input.substring(i+1);
			 System.out.println("Data here "+data + " ");
			printPermutations(data,ans+input.charAt(i));
		}
		
	}

}
