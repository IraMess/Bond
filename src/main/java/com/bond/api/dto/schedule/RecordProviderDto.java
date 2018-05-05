package com.bond.api.dto.schedule;

import java.time.ZonedDateTime;

public class RecordProviderDto {

	ZonedDateTime startService;
	String service;
	String comment;
	ScheduleClientDto client;

	public RecordProviderDto() {
	}

	public RecordProviderDto(ZonedDateTime startService, String service, String comment, ScheduleClientDto client) {
		this.startService = startService;
		this.service = service;
		this.comment = comment;
		this.client = client;
	}

	public ZonedDateTime getStartService() {
		return startService;
	}

	public void setStartService(ZonedDateTime startService) {
		this.startService = startService;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public ScheduleClientDto getClient() {
		return client;
	}

	public void setClient(ScheduleClientDto client) {
		this.client = client;
	}
}
