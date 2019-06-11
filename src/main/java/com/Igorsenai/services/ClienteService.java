package com.Igorsenai.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Igorsenai.domain.Cliente;
import com.Igorsenai.exceptions.ObjectNotFoundException;
import com.Igorsenai.repositories.ClienteRepository;

@Service
public class ClienteService {

	private ClienteRepository repo;

	public Cliente buscar(Integer idCliente) {
		Optional<Cliente> obj = repo.findById(idCliente);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Número de id não encontrado. Id: " + idCliente + "tipo: " + Cliente.class.getName()));
	}

}
