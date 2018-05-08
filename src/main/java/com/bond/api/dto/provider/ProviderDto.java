package com.bond.api.dto.provider;

import java.util.*;

import com.bond.api.dto.common.*;

public class ProviderDto {

	String profession;
	String name;
	List<String> services;
	AddressDto address;
	CommunicationsDto communications;
	String email;

	public ProviderDto() {
	}

	public ProviderDto(String profession, String name, List<String> services, AddressDto address,
			CommunicationsDto communications, String email) {
		this.profession = profession;
		this.name = name;
		this.services = services;
		this.address = address;
		this.communications = communications;
		this.email = email;
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

	public AddressDto getAddress() {
		return address;
	}

	public void setAddress(AddressDto address) {
		this.address = address;
	}

	public CommunicationsDto getCommunications() {
		return communications;
	}

	public void setCommunications(CommunicationsDto communications) {
		this.communications = communications;
	}

	public String getEmail() {
		return email.toLowerCase();
	}
}
