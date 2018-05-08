/*package com.bond.webService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bond.api.dto.client.*;
import com.bond.api.enums.*;
import com.bond.interfaces.*;

@RestController("/client")
public class ClientController {

	@Autowired
	IClient clients;

	@PostMapping
	ClientReturnCode addClient(@RequestBody ClientDto clientDto) {
		return clients.addClient(clientDto);
	}

}*/