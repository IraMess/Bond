package com.bond.interfaces;

import com.bond.api.dto.ProviderDto;
import com.bond.api.enums.ProviderReturnCode;

public interface IProvider {
	
	ProviderDto getProvider(String email);
	ProviderReturnCode addProvider(ProviderDto providerDto);
}
