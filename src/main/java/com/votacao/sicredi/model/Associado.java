package com.votacao.sicredi.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Associado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAssociado;
	private String nome;
	private String cargo;
	private String email;
	private String senha;
	
	@OneToMany(mappedBy = "associado")
	private List<Pauta> pautas;

}
