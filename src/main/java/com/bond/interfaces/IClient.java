package com.bond.interfaces;

import com.bond.api.dto.ClientDto;
import com.bond.api.dto.ProviderDto;
import com.bond.api.dto.RecordDto;
import com.bond.api.enums.ClientReturnCode;

public interface IClient {
	
	ClientReturnCode addClient(ClientDto client);
	ClientReturnCode updateClient(ClientDto client);
	ClientReturnCode deleteClient();
	
	ProviderDto getProvider(String email);
	Iterable<ProviderDto> getAllProviders(String category);
	
	ClientReturnCode addRecord(RecordDto record);
	ClientReturnCode deleteRecord();
	Iterable<RecordDto> getAllRecords();

	ClientReturnCode addVote(String vote);
	ClientReturnCode addComment(String comment);
	
}
