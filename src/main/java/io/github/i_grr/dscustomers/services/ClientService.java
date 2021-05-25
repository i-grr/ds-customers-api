package io.github.i_grr.dscustomers.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.github.i_grr.dscustomers.dto.ClientDTO;
import io.github.i_grr.dscustomers.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	ClientRepository repository;
	
	@Transactional(readOnly = true)
	public List<ClientDTO> findAll() {
		return repository.findAll().stream().map(x -> new ClientDTO(x)).collect(Collectors.toList());
	}

}
