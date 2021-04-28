package edu.ocpjp.dates;

import java.time.LocalDate;
import java.time.Month;

public class Q66 {
	public static void main(String[] args) {
		LocalDate a = LocalDate.of(2014, Month.FEBRUARY, 14);
		LocalDate b = a.plusYears(1L);
		b.plusDays(15L);
		System.out.println(b);
	}
}
