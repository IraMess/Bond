package com.bond.api.dto;

public class ScheduleDto {

	DaySchedualDto[] days;

	public ScheduleDto() {
	}

	public ScheduleDto(DaySchedualDto[] days) {
		this.days = days;
	}

	public DaySchedualDto[] getDays() {
		return days;
	}

	public void setDays(DaySchedualDto[] days) {
		this.days = days;
	}

}
