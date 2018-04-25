package com.bond.modelCrud;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bond.api.*;
import com.bond.interfaces.*;

import static com.bond.api.ProviderReturnCode.*;


@Repository
public class BondCrud implements IProvider {

	@Autowired
	ProvidersRepository prividersRepository;

	@Override
	public ProviderDto getProvider(String email) {
		return toProviderDto(prividersRepository.findById(email).get());
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
		if (prividersRepository.findById(providerDto.getEmail()) != null) {
			return PROVIDER_ALREADY_EXISTS;
		}
		prividersRepository.save(new ProviderCrud(providerDto));
		return OK;
	}

}
