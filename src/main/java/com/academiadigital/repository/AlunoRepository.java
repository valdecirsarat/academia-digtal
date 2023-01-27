package com.academiadigital.repository;

import java.time.LocalDate;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.academiadigital.entity.Aluno;

@Repository
public interface AlunoRepository extends CrudRepository<Aluno, Long> {

	Iterable<Aluno> findByDataNascimento(LocalDate dataNascimento);
	
    

}
