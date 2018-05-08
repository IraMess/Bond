package com.bond.сrud.handler;

import static com.bond.api.enums.ClientReturnCode.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import com.bond.api.dto.client.*;
import com.bond.api.dto.provider.*;
import com.bond.api.enums.*;
import com.bond.interfaces.*;
import com.bond.сrud.entities.*;
import com.bond.сrud.repository.*;

@Repository
public class BondCrudClient implements IClient{
	
	@Autowired
	ClientRepository clientRepository;

	@Override
	public ClientReturnCode addClient(ClientDto clientDto) {
		if (clientRepository.findById(clientDto.getEmail()) != null) {
			return CLIENT_ALREADY_EXISTS;
		}
		clientRepository.save(new ClientCrud(clientDto));
		return OK;
	}

	@Override
	public ClientReturnCode updateClient(ClientDto clientDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClientReturnCode deleteClient() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<ProviderDto> getAllProviders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClientReturnCode addRecord(RecordClientDto recordDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClientReturnCode deleteRecord(RecordClientDto recordDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<RecordClientDto> getAllRecords() {
		// TODO Auto-generated method stub
		return null;
	}
}
