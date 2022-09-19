package com.customvalidation.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.customvalidation.dto.ClienteNewDTO;

@Service
public class clienteService {

	public Object insert(@Valid ClienteNewDTO objDto) {
		return null;
	}

}
