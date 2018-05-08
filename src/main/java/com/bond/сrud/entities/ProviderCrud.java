package com.bond.сrud.entities;

import java.util.*;

import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.*;

import com.bond.api.dto.common.*;
import com.bond.api.dto.provider.*;

@Document(collection = "providers")
public class ProviderCrud {
	@Id
	String email;
	String profession;
	String name;
	List<String> services;
	AddressCrud address;
	Map<String, String> communications;

	public ProviderCrud() {
	}

	public ProviderCrud(ProviderDto providerDto) {
		this.email = providerDto.getEmail().toLowerCase();
		this.profession = providerDto.getProfession();
		this.name = providerDto.getName();
		this.services = providerDto.getServices();

		this.address = new AddressCrud(providerDto.getAddress());
		@SuppressWarnings("unchecked")
		Class<Communications> comun = (Class<Communications>) providerDto.getCommunications().getClass();
		Arrays.stream(comun.getDeclaredFields()).forEach(key -> {
			try {
				communications.put(key.toString(), comun.getDeclaredField(key.toString()).toString());
			} catch (Exception e) {
			}
		});
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getServices() {
		return services;
	}

	public void setServices(List<String> services) {
		this.services = services;
	}

	public AddressCrud getAddress() {
		return address;
	}

	public void setAddress(AddressCrud address) {
		this.address = address;
	}

	public Map<String, String> getCommunications() {
		return communications;
	}

	public void setCommunications(Map<String, String> communications) {
		this.communications = communications;
	}

	public String getEmail() {
		return email;
	}

}
