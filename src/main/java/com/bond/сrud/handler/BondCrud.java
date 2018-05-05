package com.bond.сrud.handler;

import static com.bond.api.enums.ProviderReturnCode.*;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bond.api.dto.client.ClientDto;
import com.bond.api.dto.common.AddressDto;
import com.bond.api.dto.provider.ProviderDto;
import com.bond.api.dto.schedule.ScheduleDto;
import com.bond.api.enums.ProviderReturnCode;
import com.bond.interfaces.*;
import com.bond.сrud.entities.ProviderCrud;
import com.bond.сrud.repository.ProvidersRepository;

@Repository
public class BondCrud implements IProvider {

	@Autowired
	ProvidersRepository providersRepository;

	@Override
	public ProviderDto getProvider(String email) {
		return toProviderDto(providersRepository.findById(email).get());
	}

	private ProviderDto toProviderDto(ProviderCrud providerCrud) {
		String profession = providerCrud.getProfession();
		String name = providerCrud.getName();
		List<String> services = providerCrud.getServices();
		String city = providerCrud.getAddress().getCity();
		String street = providerCrud.getAddress().getStreet();
		String building = providerCrud.getAddress().getBuilding();
		AddressDto address = new AddressDto(city, street, building);
		Map<String, String> communications = providerCrud.getCommunications();
		String email = providerCrud.getEmail();
		return new ProviderDto(profession, name, services, address, communications, email);
	}

	@Override
	public ProviderReturnCode addProvider(ProviderDto providerDto) {
		if (providersRepository.findById(providerDto.getEmail()) != null) {
			return PROVIDER_ALREADY_EXISTS;
		}
		providersRepository.save(new ProviderCrud(providerDto));
		return OK;
	}

	@Override
	public ProviderReturnCode deleteProvider(Long idProvider) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProviderReturnCode updateProvider(ProviderDto providerDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProviderReturnCode createSchedule(ScheduleDto schedule) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ScheduleDto getSchedule() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProviderReturnCode updateSchedule(ScheduleDto schedule) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProviderReturnCode deleteSchedule() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<ClientDto> getClients() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClientDto getClient() {
		// TODO Auto-generated method stub
		return null;
	}

}
