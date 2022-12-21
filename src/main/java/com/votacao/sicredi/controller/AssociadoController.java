package com.votacao.sicredi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.votacao.sicredi.repository.AssociadoRepository;

@Controller
@RequestMapping(path = "/associado")
public class AssociadoController {
	
	@Autowired
	private AssociadoRepository repository;
	
	@GetMapping()
	public String buscarAssociado(Model model) {
		model.addAttribute("associados", repository.buscaTodosAssociados());
		return "associados/home";
	}
	
	@GetMapping("formulario")
	public String formulario() {
		return "associados/formulario";
	}

}
