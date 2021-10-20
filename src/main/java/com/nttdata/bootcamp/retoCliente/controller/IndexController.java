package com.nttdata.bootcamp.retoCliente.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.retoLibreria.config.UsuarioProperties;


@RestController
public class IndexController {
	@Autowired  UsuarioProperties u;
	
	@GetMapping("/usuario")
	public String getUsuarioString() {
		
		return u.toString();
		
	}
}
