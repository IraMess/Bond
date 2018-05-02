package com.bond.api.dto;

import java.util.*;

public class DayOfWeekDto {

	boolean isWorking;
	TimeZone startDay;
	TimeZone endDay;

	BreaksDto [] breaks;

	public DayOfWeekDto() {
	}

	public DayOfWeekDto(boolean isWorking, TimeZone startDay, TimeZone endDay, BreaksDto [] breaks) {
		this.isWorking = isWorking;
		this.startDay = startDay;
		this.endDay = endDay;
		this.breaks = breaks;
	}

	public boolean isWorking() {
		return isWorking;
	}

	public void setWorking(boolean isWorking) {
		this.isWorking = isWorking;
	}

	public TimeZone getStartDay() {
		return startDay;
	}

	public void setStartDay(TimeZone startDay) {
		this.startDay = startDay;
	}

	public TimeZone getEndDay() {
		return endDay;
	}

	public void setEndDay(TimeZone endDay) {
		this.endDay = endDay;
	}

	public BreaksDto [] getBreaks() {
		return breaks;
	}

	public void setBreaks(BreaksDto [] breaks) {
		this.breaks = breaks;
	}
}
