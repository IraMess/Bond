package com.bond.interfaces;

import com.bond.api.dto.client.*;
import com.bond.api.dto.provider.*;
import com.bond.api.enums.*;

public interface IClient {
	
	ClientReturnCode addClient(ClientDto clientDto);
	ClientReturnCode updateClient(ClientDto clientDto);
	ClientReturnCode deleteClient();
	
	Iterable<ProviderDto> getAllProviders();
	
	ClientReturnCode addRecord(RecordClientDto recordDto);
	ClientReturnCode deleteRecord(RecordClientDto recordDto);
	Iterable<RecordClientDto> getAllRecords();

//	ClientReturnCode addVote(int vote);
//	ClientReturnCode addComment(String comment);
	
}
