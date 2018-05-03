package com.bond.interfaces;

import com.bond.api.dto.ClientDto;
import com.bond.api.dto.ProviderDto;
import com.bond.api.dto.ScheduleDto;
import com.bond.api.enums.ProviderReturnCode;

public interface IProvider {
	
	ProviderReturnCode addProvider(ProviderDto providerDto);
	ProviderReturnCode deleteProvider(Long idProvider);
	ProviderReturnCode updateProvider(ProviderDto providerDto);
	ProviderDto getProvider(String email);
	
	ProviderReturnCode createSchedule(ScheduleDto schedule);
	ScheduleDto getSchedule();
	ProviderReturnCode updateSchedule(ScheduleDto schedule);
	ProviderReturnCode deleteSchedule();
	
	Iterable<ClientDto> getClients();
	ClientDto getClient();
}
