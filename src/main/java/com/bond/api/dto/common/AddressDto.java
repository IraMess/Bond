package com.bond.api.dto.common;

import java.io.Serializable;

public class AddressDto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5825691725945238729L;
	
	String city;
	String street;
	String building;
	
	
	public AddressDto() {
	}
	
	public AddressDto(String city, String street, String building) {
		this.city = city;
		this.street = street;
		this.building = building;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}
}
