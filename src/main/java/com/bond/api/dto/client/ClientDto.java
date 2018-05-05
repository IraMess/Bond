package com.bond.api.dto.client;

import com.bond.api.dto.common.*;

public class ClientDto {

	String email;
	String name;
	Communications communications;

	public ClientDto() {
	}

	public ClientDto(String email, String name, Communications communications) {
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

	public Communications getCommunications() {
		return communications;
	}

	public void setCommunications(Communications communications) {
		this.communications = communications;
	}
}
