package com.bond.api.dto.provider;

import com.bond.api.dto.schedule.ScheduleClientDto;

public class ScheduleClientsDto {
	
	ScheduleClientDto [] clients;

	public ScheduleClientsDto() {
	}

	public ScheduleClientsDto(ScheduleClientDto[] clients) {
		this.clients = clients;
	}

	public ScheduleClientDto[] getClients() {
		return clients;
	}

	public void setClients(ScheduleClientDto[] clients) {
		this.clients = clients;
	}

}
