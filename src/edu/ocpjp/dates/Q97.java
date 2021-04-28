package edu.ocpjp.dates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Q97 {
public static void main(String[] args) {
	ZoneId zone = ZoneId.of("US/Eastern");
	ZonedDateTime dt = ZonedDateTime.of(LocalDate.of(2015, 3,8), LocalTime.of(1,0),zone);
	ZonedDateTime dt2= dt.plusHours(2);
	System.out.print(DateTimeFormatter.ofPattern("H:mm-").format(dt2));
	System.out.print("difference:"+ChronoUnit.HOURS.between(dt, dt2));
}
}
