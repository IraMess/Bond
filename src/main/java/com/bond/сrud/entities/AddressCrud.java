package com.bond.сrud.entities;

import com.bond.api.dto.AddressDto;

public class AddressCrud {
	String city;
	String street;
	String building;
	
	public AddressCrud() {
	}

	public AddressCrud(AddressDto addresDto) {
		this.city = addresDto.getCity();
		this.street = addresDto.getStreet();
		this.building = addresDto.getBuilding();
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
