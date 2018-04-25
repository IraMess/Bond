package bond.interfaces;

import com.bond.api.*;

public interface IProvider {
	
	ProviderDto getProvider(String email);
	ProviderReturnCode addProvider(ProviderDto providerDto);
}
