package com.cursoudemy.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursoudemy.cursomc.domain.Categoria;
import com.cursoudemy.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired //dependencia automaticamente instanciada pelo string
	private CategoriaRepository repo;
	
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
}
