package com.bond.interfaces;

import com.bond.api.dto.provider.ProviderDto;

public interface ICommon {
	ProviderDto getProvider(String email);
}
