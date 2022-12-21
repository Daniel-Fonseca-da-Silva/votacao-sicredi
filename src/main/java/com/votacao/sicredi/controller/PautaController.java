package com.votacao.sicredi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.votacao.sicredi.repository.PautaRepository;

@Controller
@RequestMapping(path = "/pautas")
public class PautaController {
	
	@Autowired
	private PautaRepository repository;
	
	@GetMapping()
	public String buscarPauta(Model model) {
		model.addAttribute("pautas", repository.buscaTodasAsPautas());
		return "pautas/home";
	}

}
