package com.bond.api.dto;

public class ScheduleDto {

	DayScheduleDto[] days;

	public ScheduleDto() {
	}

	public ScheduleDto(DayScheduleDto[] days) {
		this.days = days;
	}

	public DayScheduleDto[] getDays() {
		return days;
	}

	public void setDays(DayScheduleDto[] days) {
		this.days = days;
	}

}
