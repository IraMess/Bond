package com.bond.api.dto.client;

import java.util.Map;

import com.bond.api.dto.common.*;

public class ClientDto {

	String email;
	String name;
	CommunicationsDto communications;

	public ClientDto() {
	}

	public ClientDto(String email, String name, CommunicationsDto communications) {
		this.email = email;
		this.name = name;
		this.communications = communications;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CommunicationsDto getCommunications() {
		return communications;
	}

	public void setCommunications(CommunicationsDto communications) {
		this.communications = communications;
	}
}
