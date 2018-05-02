package com.bond.api.dto;

import java.util.*;

public class DaySchedualDto {

	boolean isAvailable;
	SchedualeClientDto client;
	String service;
	TimeZone startService;

	public DaySchedualDto() {
	}

	public DaySchedualDto(boolean isAvailable, SchedualeClientDto client, String service, TimeZone startService) {
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

	public SchedualeClientDto getClient() {
		return client;
	}

	public void setClient(SchedualeClientDto client) {
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
