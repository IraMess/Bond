package com.bond.webService;

import static com.bond.api.ProviderApiConstants.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.bond.api.dto.provider.ProviderDto;
import com.bond.api.enums.ProviderReturnCode;
import com.bond.interfaces.*;

@RestController ("/provider")
public class ProviderController {

	@Autowired
	IProvider bonds;
	@Autowired
	ICommon commons;

	@GetMapping
	ProviderDto showProvider(@RequestParam(name = EMAIL) String email) {
		return commons.getProvider(email);
	}

	@PostMapping
	ProviderReturnCode addProvider(@RequestBody ProviderDto providerDto) {
		return bonds.addProvider(providerDto);
	}
}
