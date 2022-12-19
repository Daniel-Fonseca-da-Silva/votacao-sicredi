package com.votacao.sicredi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/pautas")
public class VotacaoController {
	
	@GetMapping()
	public String buscarPauta() {
		return "pautas/home";
	}

}