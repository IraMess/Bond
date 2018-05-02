package com.bond.api.dto;

import java.util.*;

public class BreaksDto {

	int timeBreak;
	TimeZone breakStart;

	public BreaksDto() {
	}

	public BreaksDto(int timeBreak, TimeZone breakStart) {
		super();
		this.timeBreak = timeBreak;
		this.breakStart = breakStart;
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
}
