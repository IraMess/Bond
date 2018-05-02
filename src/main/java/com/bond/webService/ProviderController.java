package com.bond.webService;

import static com.bond.api.ProviderApiConstants.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.bond.api.dto.ProviderDto;
import com.bond.api.enums.ProviderReturnCode;
import com.bond.interfaces.*;

@RestController ("/provider")
public class ProviderController {

	@Autowired
	IProvider bonds;

	@GetMapping
	ProviderDto showProvider(@RequestParam(name = EMAIL) String email) {
		return bonds.getProvider(email);
	}

	@PostMapping
	ProviderReturnCode addProvider(@RequestBody ProviderDto providerDto) {
		return bonds.addProvider(providerDto);
	}
}
