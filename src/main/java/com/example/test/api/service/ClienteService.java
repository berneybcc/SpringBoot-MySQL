package com.example.test.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.api.model.Cliente;
import com.example.test.api.repository.ClienteRepository;

@Service
public class ClienteService implements IClienteService {

	@Autowired
	private ClienteRepository cliente;
	
	@Override
	public List<Cliente> findAll() {
		return (List<Cliente>) cliente.findAll();
	}

}
