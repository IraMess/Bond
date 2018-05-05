package com.bond.api.dto.provider;

public class ProvidersDto {

	ProviderDto[] providers;

	public ProvidersDto() {
	}

	public ProvidersDto(ProviderDto[] providers) {
		this.providers = providers;
	}

	public ProviderDto[] getProviders() {
		return providers;
	}

	public void setProviders(ProviderDto[] providers) {
		this.providers = providers;
	}
}
