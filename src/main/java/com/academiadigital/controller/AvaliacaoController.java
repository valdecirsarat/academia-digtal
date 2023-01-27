package com.academiadigital.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.academiadigital.entity.AvaliacaoFisica;
import com.academiadigital.entityDTO.AvaliacaoFisicaDto;
import com.academiadigital.entityDTO.AvaliacaoFisicaUpdateDto;
import com.academiadigital.serviceImp.AvaliacaoServiceImp;


@RestController @RequestMapping("/avaliacao")
public class AvaliacaoController {
	
	@Autowired
	private AvaliacaoServiceImp avaliacaoServiceImp;
	
	@PostMapping
	public AvaliacaoFisica create(@Valid @RequestBody AvaliacaoFisicaDto avaFisicaDto) {
		
		return avaliacaoServiceImp.create(avaFisicaDto);
		
	}
	
	@GetMapping
	public Iterable<AvaliacaoFisica>findAll(){
		return avaliacaoServiceImp.getAll();
	} 
	
	@PutMapping("/atualizar-avaliacao/{id}")
	public AvaliacaoFisica atualizar(@Valid @PathVariable Long id, @RequestBody AvaliacaoFisicaUpdateDto avaFisUpdateDto) {
		return avaliacaoServiceImp.update(id, avaFisUpdateDto);
	}

}
