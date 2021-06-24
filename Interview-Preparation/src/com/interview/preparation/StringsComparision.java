package com.interview.preparation;

public class StringsComparision {

	public static void main(String[] args) {
		 String s="Sachin"; 		 
		 String s1 = "Sachin";
		 
		 System.out.println(s==s1); //true
		 
		 String s3= new String("Sachin"); 		 
		 String s4 = new String("Sachin");
		 
		 System.out.println(s3.hashCode() + " " + s4.hashCode());//-1826113608 -1826113608
		 System.out.println(s3==s4); //false
		 System.out.println(s3.equalsIgnoreCase(s4));//true
		 
		 String s5= new String("Sachin").intern(); 		 
		 String s6 = new String("Sachin").intern();
		 
		 System.out.println(s5.hashCode() + " " + s6.hashCode()); //-1826113608 -1826113608
		 
		 System.out.println(s5==s6); //true
		 System.out.println(s5.equalsIgnoreCase(s6));//true
	}

}
