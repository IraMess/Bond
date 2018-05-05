package com.bond.api.dto.client;

import java.time.*;

import com.bond.api.dto.provider.*;

public class RecordClientDto {

	ZonedDateTime startService;
	String service;
	String comment;
	ProviderDto provider;

	public RecordClientDto() {
	}

	public RecordClientDto(ZonedDateTime startService, String service, String comment, ProviderDto provider) {
		this.startService = startService;
		this.service = service;
		this.comment = comment;
		this.provider = provider;
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

	public ProviderDto getProvider() {
		return provider;
	}

	public void setProvider(ProviderDto provider) {
		this.provider = provider;
	}

}
