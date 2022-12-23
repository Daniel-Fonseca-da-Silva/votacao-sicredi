package com.votacao.sicredi.dto;

import com.votacao.sicredi.model.Pauta;

import lombok.Data;

@Data
public class PautaDTO {
	private String votoSim;
	private String votoNao;
	private String idAssociado;
	
	public Pauta toPauta() {
		Pauta pauta = new Pauta();
		
		if(votoSim != null)
			pauta.setVotoSim(Long.parseLong("1"));
		
		if(votoNao != null)
			pauta.setVotoNao(Long.parseLong("1"));
		
		return pauta;
	}
}
