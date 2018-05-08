package com.bond.сrud.entities;

import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.Document;

import com.bond.api.dto.client.*;

@Document(collection = "clients")
public class ClientCrud {
	@Id
	String email;
	String name;
	CommunicationsCrud communications;

	public ClientCrud() {
	}

	public ClientCrud(ClientDto clientDto) {
		this.email = clientDto.getEmail();
		this.name = clientDto.getName();
		this.communications = new CommunicationsCrud(clientDto.getCommunications());
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

	public CommunicationsCrud getCommunications() {
		return communications;
	}

	public void setCommunications(CommunicationsCrud communications) {
		this.communications = communications;
	}
}
