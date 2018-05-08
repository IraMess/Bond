package com.bond.сrud.entities;

import java.util.*;

import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.Document;

import com.bond.api.dto.client.*;
import com.bond.api.dto.common.Communications;

@Document(collection = "clients")
public class ClientCrud {

	@Id
	String email;
	String name;
	Map<String, String> communications;

	public ClientCrud() {
	}

	public ClientCrud(ClientDto clientDto) {
		this.email = clientDto.getEmail();
		this.name = clientDto.getName();
		@SuppressWarnings("unchecked")
		Class<Communications> comun = (Class<Communications>) clientDto.getCommunications().getClass();
		Arrays.stream(comun.getDeclaredFields()).forEach(key -> {
			try {
				communications.put(key.toString(), comun.getDeclaredField(key.toString()).toString());
			} catch (Exception e) {
			}
		});
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

	public Map<String, String> getCommunications() {
		return communications;
	}

	public void setCommunications(Map<String, String> communications) {
		this.communications = communications;
	}
}
