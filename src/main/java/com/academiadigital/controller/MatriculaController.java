package com.academiadigital.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.academiadigital.entity.Matricula;
import com.academiadigital.entityDTO.MatriculaDto;
import com.academiadigital.serviceImp.MatriculaServiceImp;

@RestController
@RequestMapping("/matricula")
public class MatriculaController {
	
	@Autowired
	private MatriculaServiceImp matriculaService;
	
	@GetMapping
	public  Iterable<Matricula> getAll() {
		return matriculaService.getAl();
		
	}
	
	@PostMapping
	public Matricula matricular(@Valid @RequestBody MatriculaDto matricula) {
		
		return matriculaService.create(matricula);
	}
	
	@DeleteMapping("apagar/{id}")
	public void deletarMatricula(@PathVariable Long id) {
		matriculaService.delete(id);
	}
}
