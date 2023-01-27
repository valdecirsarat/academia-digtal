package com.academiadigital.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.academiadigital.entity.Aluno;
import com.academiadigital.entity.Matricula;
import com.academiadigital.entityDTO.MatriculaDto;
import com.academiadigital.repository.AlunoRepository;
import com.academiadigital.repository.MatriculaRepository;
import com.academiadigital.service.MatriculaService;


@Service
public class MatriculaServiceImp implements MatriculaService {
	
	@Autowired
	MatriculaRepository matriculaRepository;
	@Autowired
	AlunoRepository alunoRepository;

	@Override
	public Matricula create(MatriculaDto matDto) {
		Matricula matricula = new Matricula();
		Aluno aluno = alunoRepository.findById(matDto.getAlunoId()).get();
		
		matricula.setAluno(aluno);
		
		return matriculaRepository.save(matricula);
		
	
	}

	@Override
	public Matricula get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Matricula> getAl() {
		// TODO Auto-generated method stub
		return  matriculaRepository.findAll();
	}

	@Override
	public void delete(Long id) {
		matriculaRepository.deleteById(id);
		
	}

	
}
