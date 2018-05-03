package com.bond.api.dto;

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
