package com.bond.api.dto.schedule;

import com.bond.api.dto.common.CommunicationsDto;

public class ScheduleClientDto {

	String name;
	CommunicationsDto communications;

	public ScheduleClientDto() {
	}

	public ScheduleClientDto(String name, CommunicationsDto communications) {
		this.name = name;
		this.communications = communications;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CommunicationsDto getComunications() {
		return communications;
	}

	public void setComunications(CommunicationsDto comunications) {
		this.communications = comunications;
	}

}
