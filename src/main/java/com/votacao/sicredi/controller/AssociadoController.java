package com.votacao.sicredi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.votacao.sicredi.dto.AssociadoDTO;
import com.votacao.sicredi.model.Associado;
import com.votacao.sicredi.repository.AssociadoRepository;

@Controller
@RequestMapping("associado")
public class AssociadoController {
	
	@Autowired
	private AssociadoRepository repository;
	
	@GetMapping()
	public String buscarAssociado(Model model) {
		model.addAttribute("associados", repository.findAll());
		return "associados/home";
	}
	
	@GetMapping("formulario")
	public String formulario() {
		return "associados/formulario";
	}
	
	@PostMapping("novo")
	public String novo(AssociadoDTO associadoDTO) {
		Associado associado = associadoDTO.toAssociado();
		repository.save(associado);
		return "associados/home";
	}

}
