package com.assignment5;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class SecondSundayTemporalAdjuster implements TemporalAdjuster {

	@Override
	public Temporal adjustInto(Temporal temporalAdjusterInput) {
		LocalDate temporalAdjusterDate = LocalDate.from(temporalAdjusterInput);
		LocalDate firstNovInYear = LocalDate.of(temporalAdjusterDate.getYear(),
				temporalAdjusterDate.getMonth(), 1);

	
		LocalDate secondSunday = firstNovInYear.with(
				TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY)).with(
				TemporalAdjusters.next(DayOfWeek.SUNDAY));
		return secondSunday;
	}

	public static void main(String... strings) {
		LocalDate currentDate = LocalDate.now();
		SecondSundayTemporalAdjuster secondSundayDayAdjuster = 
				new SecondSundayTemporalAdjuster();
		LocalDate secondSunday = currentDate.with(secondSundayDayAdjuster);
		System.out.println("Second Saturday is on " + secondSunday);

	}
}

