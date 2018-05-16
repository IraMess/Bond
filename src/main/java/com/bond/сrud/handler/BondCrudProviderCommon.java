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
		String telephone = providerCrud.getCommunications().getTelephone();
		String skype = providerCrud.getCommunications().getSkype();
		String viber = providerCrud.getCommunications().getViber();
		String whatsApp = providerCrud.getCommunications().getWhatsApp();
		String telegram = providerCrud.getCommunications().getTelegram();
		CommunicationsDto communications = new CommunicationsDto(telephone, skype, viber, whatsApp, telegram);
		String email = providerCrud.getEmail();
		return new ProviderDto(profession, name, services, address, communications, email);
	}

	@Override 
	public ProviderReturnCode addProvider(ProviderDto providerDto) {
		if (providersRepository.findById(providerDto.getEmail()).isPresent()) {
			return PROVIDER_ALREADY_EXISTS;
		}
		providersRepository.save(new ProviderCrud(providerDto));
		return OK;
	}

	@Override
	public ProviderReturnCode deleteProvider(String email) {
		if(!(providersRepository.findById(email).isPresent())){
			return PROVIDER_DOESNT_EXIST;
		}
		providersRepository.deleteById(email);
		return PROVIDER_IS_DELETED;
	}

	@Override
	public ProviderReturnCode updateProvider(ProviderDto providerDto) {
		ProviderDto fromDBProv = toProviderDto(providersRepository.findById(providerDto.getEmail()).get());
		if(providerDto.equals(fromDBProv)) {
			return PROVIDER_WASNT_UPDATE;
		}
		
		providersRepository.save(new ProviderCrud(providerDto));
		return OK;
	}

	@Override
	public Iterable<ClientDto> getClients() {
		
		return null;
	}

	@Override
	public ClientDto getClient() {

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
