package com.bond.api.dto.schedule;

//Pattern of schedule
public class PatternScheduleDto {
	PatternDayOfWeekDto sunday;
	PatternDayOfWeekDto monday;
	PatternDayOfWeekDto tuesday;
	PatternDayOfWeekDto wednesday;
	PatternDayOfWeekDto thursday;
	PatternDayOfWeekDto friday;
	PatternDayOfWeekDto saturday;
	
	int timeInterval;

	public PatternScheduleDto() {
	}

	public PatternScheduleDto(PatternDayOfWeekDto sunday, PatternDayOfWeekDto monday, PatternDayOfWeekDto tuesday,
			PatternDayOfWeekDto wednesday, PatternDayOfWeekDto thursday, PatternDayOfWeekDto friday, PatternDayOfWeekDto saturday,
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

	public PatternDayOfWeekDto getSunday() {
		return sunday;
	}

	public void setSunday(PatternDayOfWeekDto sunday) {
		this.sunday = sunday;
	}

	public PatternDayOfWeekDto getMonday() {
		return monday;
	}

	public void setMonday(PatternDayOfWeekDto monday) {
		this.monday = monday;
	}

	public PatternDayOfWeekDto getTuesday() {
		return tuesday;
	}

	public void setTuesday(PatternDayOfWeekDto tuesday) {
		this.tuesday = tuesday;
	}

	public PatternDayOfWeekDto getWednesday() {
		return wednesday;
	}

	public void setWednesday(PatternDayOfWeekDto wednesday) {
		this.wednesday = wednesday;
	}

	public PatternDayOfWeekDto getThursday() {
		return thursday;
	}

	public void setThursday(PatternDayOfWeekDto thursday) {
		this.thursday = thursday;
	}

	public PatternDayOfWeekDto getFriday() {
		return friday;
	}

	public void setFriday(PatternDayOfWeekDto friday) {
		this.friday = friday;
	}

	public PatternDayOfWeekDto getSaturday() {
		return saturday;
	}

	public void setSaturday(PatternDayOfWeekDto saturday) {
		this.saturday = saturday;
	}

	public int getTimeInterval() {
		return timeInterval;
	}

	public void setTimeInterval(int timeInterval) {
		this.timeInterval = timeInterval;
	}
}


