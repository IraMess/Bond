package com.bond.api.dto.schedule;

import com.bond.api.dto.common.Communications;

public class ScheduleClientDto {

	String name;
	Communications communications;

	public ScheduleClientDto() {
	}

	public ScheduleClientDto(String name, Communications communications) {
		this.name = name;
		this.communications = communications;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Communications getComunications() {
		return communications;
	}

	public void setComunications(Communications comunications) {
		this.communications = comunications;
	}

}
