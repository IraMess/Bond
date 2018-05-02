package com.bond.api.dto;

import java.util.*;

public class PatternScheduleDto {

	boolean sunday;
	boolean monday;
	boolean tuesday;
	boolean wednesday;
	boolean thursday;
	boolean friday;
	boolean saturday;
	
	TimeZone startDay;
	TimeZone endDay;
	
	int timeBreak;
	TimeZone breakStart;
	int timeInterval;
	
	
	public PatternScheduleDto() {
	}

	public PatternScheduleDto(boolean sunday, boolean monday, boolean tuesday, boolean wednesday, boolean thursday,
			boolean friday, boolean saturday, TimeZone startDay, TimeZone endDay, int timeBreak, TimeZone breakStart,
			int timeInterval) {
		this.sunday = sunday;
		this.monday = monday;
		this.tuesday = tuesday;
		this.wednesday = wednesday;
		this.thursday = thursday;
		this.friday = friday;
		this.saturday = saturday;
		this.startDay = startDay;
		this.endDay = endDay;
		this.timeBreak = timeBreak;
		this.breakStart = breakStart;
		this.timeInterval = timeInterval;
	}

	public boolean isSunday() {
		return sunday;
	}

	public void setSunday(boolean sunday) {
		this.sunday = sunday;
	}

	public boolean isMonday() {
		return monday;
	}

	public void setMonday(boolean monday) {
		this.monday = monday;
	}

	public boolean isTuesday() {
		return tuesday;
	}

	public void setTuesday(boolean tuesday) {
		this.tuesday = tuesday;
	}

	public boolean isWednesday() {
		return wednesday;
	}

	public void setWednesday(boolean wednesday) {
		this.wednesday = wednesday;
	}

	public boolean isThursday() {
		return thursday;
	}

	public void setThursday(boolean thursday) {
		this.thursday = thursday;
	}

	public boolean isFriday() {
		return friday;
	}

	public void setFriday(boolean friday) {
		this.friday = friday;
	}

	public boolean isSaturday() {
		return saturday;
	}

	public void setSaturday(boolean saturday) {
		this.saturday = saturday;
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

	public int getTimeBreak() {
		return timeBreak;
	}

	public void setTimeBreak(int timeBreak) {
		this.timeBreak = timeBreak;
	}

	public TimeZone getBreakStart() {
		return breakStart;
	}

	public void setBreakStart(TimeZone breakStart) {
		this.breakStart = breakStart;
	}

	public int getTimeInterval() {
		return timeInterval;
	}

	public void setTimeInterval(int timeInterval) {
		this.timeInterval = timeInterval;
	}	
}
