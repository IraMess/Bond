package com.bond.api.dto;

import java.util.*;

public class DayScheduleDto {

	boolean isAvailable;
	ScheduleClientDto client;
	String service;
	TimeZone startService;

	public DayScheduleDto() {
	}

	public DayScheduleDto(boolean isAvailable, ScheduleClientDto client, String service, TimeZone startService) {
		this.isAvailable = isAvailable;
		this.client = client;
		this.service = service;
		this.startService = startService;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public ScheduleClientDto getClient() {
		return client;
	}

	public void setClient(ScheduleClientDto client) {
		this.client = client;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public TimeZone getStartService() {
		return startService;
	}

	public void setStartService(TimeZone startService) {
		this.startService = startService;
	}

}
