package com.interview.preparation.java8.features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Java8DateAPIExample {

	public static void main(String[] args) {

		// Local Date Operations
		LocalDate localDate = LocalDate.now();
		System.out.println("Local Date is : " + localDate);// 2021-04-12
		System.out.println("Adding Days : " + localDate.plusDays(2));//2021-04-14
		System.out.println("Adding Months : " + localDate.plusMonths(2));//2021-06-12
		System.out.println("Adding Weeks : " + localDate.plusWeeks(2));//2021-04-26
		System.out.println("Adding Years : " + localDate.plusYears(2));//2023-04-12

		// Local Date Operations
		LocalTime localTime = LocalTime.now();
		System.out.println("Local Time is : " + localTime);//20:17:35.381546200
		System.out.println("Adding Hours : " + localTime.plusHours(5));//01:17:35.381546200
		System.out.println("Adding Minutes : " + localTime.plusMinutes(20));//20:37:35.381546200
		System.out.println("Adding Seconds : " + localTime.plusSeconds(55));//20:18:30.381546200
		
		
		
		
		
		
		
		
		
		
		

		/*localDate = LocalDate.of(2020, 01, 20);
		System.out.println("Local date of : " + localDate); // 2020-01-20

		localDate = LocalDate.parse("2020-02-06");
		System.out.println("String to Local date conversion " + localDate);// 2020-02-06

		// Local Date Operations
		LocalTime localTime = LocalTime.now();
		System.out.println("Local TIme is : " + localTime);// 20:08:14.345938300

		localTime = LocalTime.of(12, 30, 55);
		System.out.println("Local Time of : " + localTime);// 12:30:55

		localTime = LocalTime.parse("12:30");
		System.out.println("String to Local date conversion " + localTime);// 12:30

		// LocalDateTime Operations
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);// 2021-04-12T20:09:59.496450300*/

	}

}
