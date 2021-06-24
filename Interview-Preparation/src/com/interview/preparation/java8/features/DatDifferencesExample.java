package com.interview.preparation.java8.features;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DatDifferencesExample {

	public static void main(String[] args) {
		LocalDateTime localDateTime1 = LocalDateTime.of(2000, 01, 03, 11, 52);
		LocalDateTime localDateTime2 = LocalDateTime.of(2021, 07, 06, 10, 22);
		
		System.out.println("Number of Days between two dates " + ChronoUnit.DAYS.between(localDateTime1, localDateTime2));//7854
		System.out.println("Number of Months between two dates " +ChronoUnit.MONTHS.between(localDateTime1, localDateTime2));//258
		System.out.println("Number of Years between two dates " +ChronoUnit.YEARS.between(localDateTime1, localDateTime2));//21
		System.out.println("Number of Hours between two dates " +ChronoUnit.HOURS.between(localDateTime1, localDateTime2));//188518
	}

}
