package com.axelfelipe.curso.nelioalves.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axelfelipe.curso.nelioalves.domain.Categoria;
import com.axelfelipe.curso.nelioalves.repositories.CategoriaRepository;
import com.axelfelipe.curso.nelioalves.services.exceptions.ObjectNotFoundExcepetion;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundExcepetion(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}
}
