package com.bond.сrud.handler;

import static com.bond.api.enums.ProviderReturnCode.*;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import com.bond.api.dto.client.*;
import com.bond.api.dto.common.*;
import com.bond.api.dto.provider.*;
import com.bond.api.dto.schedule.*;
import com.bond.api.enums.*;
import com.bond.interfaces.*;
import com.bond.сrud.entities.*;
import com.bond.сrud.repository.*;

@Repository
public class BondCrudProviderCommon implements IProvider, ICommon {

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
	public Iterable<ClientDto> getClients() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClientDto getClient() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProviderReturnCode createPatternSchedule(ScheduleDto schedule) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PatternScheduleDto getPatternSchedule() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProviderReturnCode updatePatternSchedule(ScheduleDto schedule) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProviderReturnCode deletePatternSchedule() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProviderReturnCode clearPatternSchedule() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProviderReturnCode editSchedule(ScheduleDto schedule) {
		// TODO Auto-generated method stub
		return null;
	}

}
