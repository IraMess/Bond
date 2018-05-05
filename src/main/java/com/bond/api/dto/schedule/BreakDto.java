package com.bond.api.dto.schedule;

import java.time.*;

public class BreakDto {

	int timeBreak;
	ZonedDateTime breakStart;

	public BreakDto() {
	}

	public BreakDto(int timeBreak, ZonedDateTime breakStart) {
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

	public ZonedDateTime getBreakStart() {
		return breakStart;
	}

	public void setBreakStart(ZonedDateTime breakStart) {
		this.breakStart = breakStart;
	}
}
