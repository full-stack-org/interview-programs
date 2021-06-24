package com.interview.preparation.java8.features;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class DateFormation {

	public static void main(String[] args) {

		LocalDateTime ldt = LocalDateTime.now();
		ZonedDateTime klDateTime = ldt.atZone(ZoneId.of("Asia/Kuala_Lumpur"));
		System.out.println(klDateTime); //2021-04-12T20:34:00.141037400+08:00[Asia/Kuala_Lumpur]
		
		ZonedDateTime achacago = ldt.atZone(ZoneId.of("America/Chicago"));
		System.out.println(achacago); //2021-04-12T20:37:18.066819300-05:00[America/Chicago]
		
		ZonedDateTime akolkata = ldt.atZone(ZoneId.of("Asia/Kolkata"));
		System.out.println(akolkata); //2021-04-12T20:37:18.066819300+05:30[Asia/Kolkata]
		
		
		
		
		//DateTimeFormatter
		DateTimeFormatter FOMATTER = DateTimeFormatter.ofPattern("MM/dd/yyyy 'at' hh:mm a");
		LocalDateTime localDateTime = LocalDateTime.now();
		String ldtString = FOMATTER.format(localDateTime);
		System.out.println(ldtString);//04/12/2021 at 08:23 PM
		
		//DateTimeFormatterBuilder
		DateTimeFormatterBuilder formatterBuilder = new DateTimeFormatterBuilder();
		formatterBuilder.append(DateTimeFormatter.ISO_LOCAL_DATE_TIME).appendZoneOrOffsetId();
		DateTimeFormatter formatter = formatterBuilder.toFormatter();
		System.out.println(formatter.format(ZonedDateTime.now()));//2021-04-12T20:28:32.9118029Asia/Colombo
		
	}

}
