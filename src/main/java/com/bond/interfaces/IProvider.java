package com.bond.interfaces;

import com.bond.api.dto.client.ClientDto;
import com.bond.api.dto.provider.ProviderDto;
import com.bond.api.dto.schedule.*;
import com.bond.api.enums.ProviderReturnCode;

public interface IProvider {
	
	ProviderReturnCode addProvider(ProviderDto providerDto);
	ProviderReturnCode deleteProvider(String email);
	ProviderReturnCode updateProvider(ProviderDto providerDto);
	

	ProviderReturnCode createPatternSchedule(ScheduleDto schedule);
	PatternScheduleDto getPatternSchedule();
	ProviderReturnCode updatePatternSchedule(ScheduleDto schedule);
	ProviderReturnCode deletePatternSchedule();
	ProviderReturnCode clearPatternSchedule();
	
	ProviderReturnCode editSchedule(ScheduleDto schedule);
	
	Iterable<ClientDto> getClients();
	ClientDto getClient();
}
