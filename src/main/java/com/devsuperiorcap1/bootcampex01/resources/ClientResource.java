package com.devsuperiorcap1.bootcampex01.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperiorcap1.bootcampex01.services.ClientService;

@RestController
@RequestMapping(value = "clients")
public class ClientResource {
	
	@Autowired
	private ClientService client;
}
