package com.bond.api.dto.schedule;

import java.time.*;

public class DayScheduleDto {

	boolean isAvailable;
	ZonedDateTime startDay;
	ZonedDateTime finishDay;
	RecordProviderDto[] records;
	BreakDto[] breaks;

	public DayScheduleDto() {
	}

	public DayScheduleDto(boolean isAvailable, ZonedDateTime startDay, ZonedDateTime finishDay, RecordProviderDto[] records,
			BreakDto[] breaks) {
		this.isAvailable = isAvailable;
		this.startDay = startDay;
		this.finishDay = finishDay;
		this.records = records;
		this.breaks = breaks;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public ZonedDateTime getStartDay() {
		return startDay;
	}

	public void setStartDay(ZonedDateTime startDay) {
		this.startDay = startDay;
	}

	public ZonedDateTime getFinishDay() {
		return finishDay;
	}

	public void setFinishDay(ZonedDateTime finishDay) {
		this.finishDay = finishDay;
	}

	public RecordProviderDto[] getRecords() {
		return records;
	}

	public void setRecords(RecordProviderDto[] records) {
		this.records = records;
	}

	public BreakDto[] getBreaks() {
		return breaks;
	}

	public void setBreaks(BreakDto[] breaks) {
		this.breaks = breaks;
	}
}
