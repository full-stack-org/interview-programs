package com.interview.preparation.innerclasses;

enum Day {
	MON, TUE, WED, THU, FRI, SAT, SUN
}

public class EnumExample{
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Day d = null;
		
        System.out.println(d == Day.MON); //false
  
        System.out.println(d.equals(Day.MON)); //java.lang.NullPointerException
        
        Object c = Class.forName("DemoTest").newInstance();
	}
}