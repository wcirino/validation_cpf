package com.customvalidation.resource;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.customvalidation.dto.ClienteNewDTO;
import com.customvalidation.service.clienteService;

@RestController
@RequestMapping(value="/clientes")
public class ClienteResource {
	
	@Autowired
	private clienteService service;
	

	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<?> insert(@Valid @RequestBody ClienteNewDTO objDto) {
		service.insert(objDto);
		return new ResponseEntity<>("Foi criado com sucesso", HttpStatus.CREATED);
	}
	
}
