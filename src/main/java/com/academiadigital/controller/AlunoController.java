package com.academiadigital.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.academiadigital.entity.Aluno;
import com.academiadigital.entityDTO.AlunoDto;
import com.academiadigital.entityDTO.AlunoUpdateDto;
import com.academiadigital.serviceImp.AlunoServiceImp;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
	
	@Autowired
	private AlunoServiceImp serviceImp;
	
	@GetMapping
	public ResponseEntity<Iterable<Aluno>> buscar(@RequestParam(value = "dataNascimento", required = false) String dataNascimento){
		Iterable<Aluno> teste = serviceImp.getAll(dataNascimento);		
		return new ResponseEntity<Iterable<Aluno>>(teste, HttpStatus.OK);
	}
	
	@PostMapping
	public Aluno create(@Valid @RequestBody AlunoDto aluno) {
		return serviceImp.create(aluno);
	}	
	
	@GetMapping("/{id}")
	public Optional<Aluno>get(@PathVariable Long id){
		return serviceImp.get(id);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		serviceImp.delete(id);
		
	}
	
	@PutMapping("atualizar/{id}")
	public Aluno atualizar(@Valid @PathVariable Long id, @RequestBody AlunoUpdateDto aluUpdateDto) {
		return serviceImp.update(id, aluUpdateDto);
	}
	
}
