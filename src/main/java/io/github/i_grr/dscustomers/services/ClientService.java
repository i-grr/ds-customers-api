package io.github.i_grr.dscustomers.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.i_grr.dscustomers.entities.Client;
import io.github.i_grr.dscustomers.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	ClientRepository repository;
	
	public List<Client> findAll() {
		return repository.findAll();
	}

}
