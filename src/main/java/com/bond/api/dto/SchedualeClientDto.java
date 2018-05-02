package com.bond.api.dto;

public class SchedualeClientDto {

	String name;
	Comunications comunications;

	public SchedualeClientDto() {
	}

	public SchedualeClientDto(String name, Comunications comunications) {
		this.name = name;
		this.comunications = comunications;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Comunications getComunications() {
		return comunications;
	}

	public void setComunications(Comunications comunications) {
		this.comunications = comunications;
	}

}
