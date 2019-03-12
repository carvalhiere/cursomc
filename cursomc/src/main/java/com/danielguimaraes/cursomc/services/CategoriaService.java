package com.danielguimaraes.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danielguimaraes.cursomc.domain.Categoria;
import com.danielguimaraes.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired //automaticamente instanciada pelo Spring, atraves de injecao de dependencia ou invercao de controle	
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
		
	}

}
