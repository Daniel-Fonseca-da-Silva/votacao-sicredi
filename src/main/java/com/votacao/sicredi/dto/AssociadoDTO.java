package com.votacao.sicredi.dto;

import com.votacao.sicredi.model.Associado;

import lombok.Data;

@Data
public class AssociadoDTO {
	
	private String nome;
	private String cargo;
	private String email;
	private String senha;
	
	public Associado toAssociado() {
		Associado associado = new Associado();
		associado.setNome(nome);
		associado.setCargo(cargo);
		associado.setEmail(email);
		associado.setSenha(senha);
		return associado;
	}

}
