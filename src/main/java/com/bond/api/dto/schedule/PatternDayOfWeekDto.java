package com.bond.api.dto.schedule;

import java.time.*;

//Pattern of the day
public class PatternDayOfWeekDto {

	boolean isWorking;
	ZonedDateTime startDay;
	ZonedDateTime endDay;

	BreakDto[] breaks;

	public PatternDayOfWeekDto() {
	}

	public PatternDayOfWeekDto(boolean isWorking) {
		this.isWorking = isWorking;
	}

	public PatternDayOfWeekDto(boolean isWorking, ZonedDateTime startDay, ZonedDateTime endDay, BreakDto[] breaks) {
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

	public ZonedDateTime getStartDay() {
		return startDay;
	}

	public void setStartDay(ZonedDateTime startDay) {
		this.startDay = startDay;
	}

	public ZonedDateTime getEndDay() {
		return endDay;
	}

	public void setEndDay(ZonedDateTime endDay) {
		this.endDay = endDay;
	}

	public BreakDto[] getBreaks() {
		return breaks;
	}

	public void setBreaks(BreakDto[] breaks) {
		this.breaks = breaks;
	}
}
