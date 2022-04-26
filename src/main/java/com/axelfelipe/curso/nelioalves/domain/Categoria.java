package com.axelfelipe.curso.nelioalves.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Categoria implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nome;
	
}
