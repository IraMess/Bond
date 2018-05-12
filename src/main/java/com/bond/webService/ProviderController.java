package com.bond.webService;

import static com.bond.api.ApiConstants.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.bond.api.dto.provider.ProviderDto;
import com.bond.api.enums.ProviderReturnCode;
import com.bond.interfaces.*;

@RestController 
@RequestMapping ("/provider")
public class ProviderController {

	@Autowired
	IProvider providers;
	@Autowired
	ICommon commons;

	@GetMapping
	ProviderDto showProvider(@RequestParam(name = EMAIL) String email) {
		return commons.getProvider(email);
	}

	@PostMapping
	ProviderReturnCode addProvider(@RequestBody ProviderDto providerDto) {
		return providers.addProvider(providerDto);
	}
	
	@PutMapping(PROFILE)
	ProviderReturnCode updateProvider(@RequestBody ProviderDto providerDto) {
		return providers.updateProvider(providerDto);
	}
	
	@DeleteMapping(PROFILE)
	ProviderReturnCode deleteProvider(@RequestParam(name = EMAIL) String email) {
		return providers.deleteProvider(email);
	}
	
}