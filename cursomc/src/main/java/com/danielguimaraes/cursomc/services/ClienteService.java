package com.danielguimaraes.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danielguimaraes.cursomc.domain.Cliente;
import com.danielguimaraes.cursomc.repositories.ClienteRepository;
import com.danielguimaraes.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired //automaticamente instanciada pelo Spring, atraves de injecao de dependencia ou invercao de controle	
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto nao encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
		
	}

}
