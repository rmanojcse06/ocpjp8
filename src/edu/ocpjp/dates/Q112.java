package edu.ocpjp.dates;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Q112 {
public static void main(String[] args) {
	LocalTime now=LocalTime.of(8,30);
	long timeToBreakfast=0;
	LocalTime office_start=LocalTime.of(7,30);
	if(office_start.isAfter(now))
		timeToBreakfast=now.until(office_start, ChronoUnit.MINUTES);
	else
		timeToBreakfast=now.until(office_start, ChronoUnit.HOURS);
	System.out.println(timeToBreakfast);
}
}
