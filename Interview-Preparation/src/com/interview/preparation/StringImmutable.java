package com.interview.preparation;

public class StringImmutable {

	public static void main(String[] args) {
		 String s="Sachin"; 		 
		 String s1 = "Sachin";
		 
		 System.out.println(s +" "+ s1); //Sachin Sachin
		 
		 s = "tendulkar";		 
		 System.out.println(s +" "+ s1); //tendulkar Sachin 
		 
		 s.concat(" Tendulkar");
		 s1.concat(" Tendulkar");
		 System.out.println(s); //tendulkar Sachin
		 
		 s = s.concat(" Tendulkar");		 
		 System.out.println(s); //tendulkar Tendulkar
	}
}
