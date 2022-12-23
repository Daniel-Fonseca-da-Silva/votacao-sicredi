package com.votacao.sicredi.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.votacao.sicredi.dto.AssociadoDTO;
import com.votacao.sicredi.dto.PautaDTO;
import com.votacao.sicredi.model.Associado;
import com.votacao.sicredi.model.Pauta;
import com.votacao.sicredi.repository.AssociadoRepository;
import com.votacao.sicredi.repository.PautaRepository;

@Controller
@RequestMapping("pautas")
public class PautaController {
	
	@Autowired
	private PautaRepository repository;
	
	@Autowired
	private AssociadoRepository associadoRepository;
	
	@GetMapping()
	public String buscarPauta(Model model) {
		model.addAttribute("pautas", repository.findAll());
		return "pautas/home";
	}
	
	@GetMapping("formulario")
	public String formulario() {
		return "pautas/formulario";
	}
	
	@PostMapping("novo")
	public String novo(PautaDTO pautaDTO) {
		Long idAssociado = Long.valueOf(pautaDTO.getIdAssociado());
		if(idAssociado != null) {
			Optional<Associado> associadoFind = associadoRepository.findById(idAssociado);
			if(associadoFind.isPresent());
				
		}
		Pauta pauta = pautaDTO.toPauta();
		repository.save(pauta);
		return "pautas/home";
	}

}
