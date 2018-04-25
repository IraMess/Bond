package com.bond.appl;

import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.web.bind.annotation.*;

import static com.bond.api.ProviderApiConstants.*;

import com.bond.api.*;
import bond.interfaces.*;

@RestController ("/provider")
@ImportResource("bond.xml")
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
