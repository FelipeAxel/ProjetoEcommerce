package com.axelfelipe.curso.nelioalves;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.axelfelipe.curso.nelioalves.domain.Categoria;
import com.axelfelipe.curso.nelioalves.repositories.CategoriaRepository;

@SpringBootApplication
public class AxelnovaisApplication implements CommandLineRunner{
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(AxelnovaisApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
			Categoria cat1 = new Categoria(null, "informatica");
			Categoria cat2 = new Categoria(null, "escritorio");
			
			categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		
	}

}
