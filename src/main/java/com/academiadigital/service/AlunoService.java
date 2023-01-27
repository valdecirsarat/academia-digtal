package com.academiadigital.service;

import java.util.Optional;

import com.academiadigital.entity.Aluno;
import com.academiadigital.entityDTO.AlunoDto;
import com.academiadigital.entityDTO.AlunoUpdateDto;

public interface AlunoService {

	
	Aluno create(AlunoDto aluno);
	
	Optional<Aluno> get(Long id);
	
	Iterable<Aluno> getAll(String dataNascimento);
	
	Aluno update(Long id, AlunoUpdateDto alunoUpdateDto);
	
	void delete(Long id);
	
	
	
}
