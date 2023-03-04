package br.com.sittaz.correios.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sittaz.correios.model.Address;
import jakarta.websocket.server.PathParam;

@RestController
public class CorreiosController {
	
	@GetMapping("/status")
	public String getStatus() {
		return "Up";
	}
	
	@GetMapping("/zipcode{zipcode}")
	public Address getAddressByZipcode(@PathParam("zipcode") String zipcode) {
		Address address = new Address();
		address.setZipCode(zipcode);
		
		return address;
		
		
		return Address.builder().zipcode(zipcode).build();
		
	}
}
