package com.academiadigital.serviceImp;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.academiadigital.entity.Aluno;
import com.academiadigital.entityDTO.AlunoDto;
import com.academiadigital.entityDTO.AlunoUpdateDto;
import com.academiadigital.repository.AlunoRepository;
import com.academiadigital.service.AlunoService;


@Service
public class AlunoServiceImp implements AlunoService {
	@Autowired
	AlunoRepository alunoRepository;

	@Override
	public Aluno create(AlunoDto aluno) {
		Aluno alunoNovo = new Aluno();

		alunoNovo.setNome(aluno.getNome());
		alunoNovo.setCpf(aluno.getCpf());
		alunoNovo.setBairro(aluno.getBairro());
		alunoNovo.setDataNascimento(aluno.getDataNascimento());

		return alunoRepository.save(alunoNovo);
	}

	
	@Override
	public Iterable<Aluno> getAll(String dataNascimento) {
		if(dataNascimento == null) {
			return alunoRepository.findAll();
		}else {
			
			LocalDate localDate = LocalDate.parse(dataNascimento);
			return alunoRepository.findByDataNascimento(localDate);
		}
		
		
	}

	@Override
	public void delete(Long id) {
		if (alunoRepository.existsById(id)) {
			alunoRepository.deleteById(id);
		}
	

	}

	@Override
	public Aluno update(Long id, AlunoUpdateDto alunoUpdateDto) {
		Aluno alu = new Aluno();
		Optional<Aluno> aluno = alunoRepository.findById(id);
		if(aluno.isPresent()) {
			alu.setId(aluno.get().getId());
			alu.setCpf(aluno.get().getCpf());
			alu.setDataNascimento(aluno.get().getDataNascimento());
			alu.setNome(alunoUpdateDto.getNome());
			alu.setBairro(alunoUpdateDto.getBairro());
			return alunoRepository.save(alu);
		}
		
		return null;
	
	}


	@Override
	public Optional<Aluno> get(Long id) {
		// TODO Auto-generated method stub
		return alunoRepository.findById(id);
	}





	

}
