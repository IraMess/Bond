package com.bond.interfaces;

import com.bond.api.dto.client.ClientDto;
import com.bond.api.dto.provider.ProviderDto;
import com.bond.api.dto.schedule.RecordProviderDto;
import com.bond.api.enums.ClientReturnCode;

public interface IClient {
	
	ClientReturnCode addClient(ClientDto client);
	ClientReturnCode updateClient(ClientDto client);
	ClientReturnCode deleteClient();
	
	Iterable<ProviderDto> getAllProviders(Long idClient);
	
	ClientReturnCode addRecord(RecordProviderDto record);
	ClientReturnCode deleteRecord();
	Iterable<RecordProviderDto> getAllRecords();

	ClientReturnCode addVote(int vote);
	ClientReturnCode addComment(String comment);
	
}
