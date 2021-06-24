package com.logical.strings;

public class CountCharacterOccurence {

	public static void main(String[] args) {
		 String s = "Java is java again java again";
		 int count = s.length() - s.replace("a", "").length();
		 System.out.println(count);//10
	}

}
