package com.danielguimaraes.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danielguimaraes.cursomc.domain.Pedido;
import com.danielguimaraes.cursomc.repositories.PedidoRepository;
import com.danielguimaraes.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired //automaticamente instanciada pelo Spring, atraves de injecao de dependencia ou invercao de controle	
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto nao encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
		
	}

}
