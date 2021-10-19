package com.example.test.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.api.model.Cliente;
import com.example.test.api.service.IClienteService;

@RestController
public class ClienteController {

	@Autowired
	private IClienteService cliente;
	
	
	@GetMapping(value = "/test")
	public List<Cliente> listaCliente(){
		return (List<Cliente>)cliente.findAll();
	}
}
