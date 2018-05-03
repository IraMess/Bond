package com.bond.api.dto;

public class PatternScheduleWeekDto {
	DayOfWeekDto sunday;
	DayOfWeekDto monday;
	DayOfWeekDto tuesday;
	DayOfWeekDto wednesday;
	DayOfWeekDto thursday;
	DayOfWeekDto friday;
	DayOfWeekDto saturday;
	
	int timeInterval;

	public PatternScheduleWeekDto() {
	}

	public PatternScheduleWeekDto(DayOfWeekDto sunday, DayOfWeekDto monday, DayOfWeekDto tuesday,
			DayOfWeekDto wednesday, DayOfWeekDto thursday, DayOfWeekDto friday, DayOfWeekDto saturday,
			int timeInterval) {
		this.sunday = sunday;
		this.monday = monday;
		this.tuesday = tuesday;
		this.wednesday = wednesday;
		this.thursday = thursday;
		this.friday = friday;
		this.saturday = saturday;
		this.timeInterval = timeInterval;
	}

	public DayOfWeekDto getSunday() {
		return sunday;
	}

	public void setSunday(DayOfWeekDto sunday) {
		this.sunday = sunday;
	}

	public DayOfWeekDto getMonday() {
		return monday;
	}

	public void setMonday(DayOfWeekDto monday) {
		this.monday = monday;
	}

	public DayOfWeekDto getTuesday() {
		return tuesday;
	}

	public void setTuesday(DayOfWeekDto tuesday) {
		this.tuesday = tuesday;
	}

	public DayOfWeekDto getWednesday() {
		return wednesday;
	}

	public void setWednesday(DayOfWeekDto wednesday) {
		this.wednesday = wednesday;
	}

	public DayOfWeekDto getThursday() {
		return thursday;
	}

	public void setThursday(DayOfWeekDto thursday) {
		this.thursday = thursday;
	}

	public DayOfWeekDto getFriday() {
		return friday;
	}

	public void setFriday(DayOfWeekDto friday) {
		this.friday = friday;
	}

	public DayOfWeekDto getSaturday() {
		return saturday;
	}

	public void setSaturday(DayOfWeekDto saturday) {
		this.saturday = saturday;
	}

	public int getTimeInterval() {
		return timeInterval;
	}

	public void setTimeInterval(int timeInterval) {
		this.timeInterval = timeInterval;
	}
}


