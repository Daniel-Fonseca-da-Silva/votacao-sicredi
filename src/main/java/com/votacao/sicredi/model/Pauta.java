package com.votacao.sicredi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Pauta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPauta;
	private Long votoSim;
	private Long votoNao;
	
	@ManyToOne
	@JoinColumn(name = "associado_id")
	private Associado associado;
}
