package com.bond.api.dto.client;

public class RecordsClientDto {
	
	RecordClientDto [] records;

	public RecordsClientDto() {
	}

	public RecordsClientDto(RecordClientDto[] records) {
		this.records = records;
	}

	public RecordClientDto[] getRecords() {
		return records;
	}

	public void setRecords(RecordClientDto[] records) {
		this.records = records;
	}
}
