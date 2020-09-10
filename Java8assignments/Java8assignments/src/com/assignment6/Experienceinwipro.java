package com.assignment6;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class Experienceinwipro {


public static void main(String args[]) {
	
	LocalDate joined=LocalDate.of(2019, Month.OCTOBER, 14);
	LocalDate today=LocalDate.now();
	Period exp=Period.between(joined,today);
	int year=exp.getYears();
	int months=exp.getMonths();
	int days=exp.getDays();
	
	System.out.println("No of years"+year);
	System.out.println("No of months"+months);
	System.out.println("No of days "+days);
}
}
