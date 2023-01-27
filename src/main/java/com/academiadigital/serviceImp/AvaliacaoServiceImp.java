package com.academiadigital.serviceImp;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.academiadigital.entity.Aluno;
import com.academiadigital.entity.AvaliacaoFisica;
import com.academiadigital.entityDTO.AvaliacaoFisicaDto;
import com.academiadigital.entityDTO.AvaliacaoFisicaUpdateDto;
import com.academiadigital.repository.AlunoRepository;
import com.academiadigital.repository.AvaliacaoFisicaRepository;
import com.academiadigital.service.AvaliacaoFisicaService;

@Service
public class AvaliacaoServiceImp implements AvaliacaoFisicaService{
	
	
	@Autowired
	private AvaliacaoFisicaRepository avaFisicaRepository;
	
	@Autowired
	private AlunoRepository alunoRepository;

	@Override
	public AvaliacaoFisica create(AvaliacaoFisicaDto avaFisicaDto) {
		// TODO Auto-generated method stub
		AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
		Aluno aluno = alunoRepository.findById(avaFisicaDto.getAlunoId()).get();
		avaliacaoFisica.setAluno(aluno);
		avaliacaoFisica.setPeso(avaFisicaDto.getPeso());
		avaliacaoFisica.setAltura(avaFisicaDto.getAltura());
		
		return avaFisicaRepository.save(avaliacaoFisica);
		
		
	}

	@Override
	public Optional<AvaliacaoFisica> get(Long id) {
		// TODO Auto-generated method stub
		return avaFisicaRepository.findById(id);
		
	}

	@Override
	public Iterable<AvaliacaoFisica> getAll() {
		// TODO Auto-generated method stub
		return avaFisicaRepository.findAll();
		
	}

	@Override
	public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateDto avaUpdateDto) {
		AvaliacaoFisica avaUpdate = new AvaliacaoFisica();
		AvaliacaoFisica ava = avaFisicaRepository.findById(id).get();
		
		avaUpdate.setId(ava.getId());
		avaUpdate.setAluno(ava.getAluno());
		avaUpdate.setDataAvaliacao(ava.getDataAvaliacao());
		avaUpdate.setAltura(avaUpdateDto.getAltura());
		avaUpdate.setPeso(avaUpdateDto.getPeso());
		
		return avaFisicaRepository.save(avaUpdate);
		
	}

	@Override
	public void delete(Long id) {
		avaFisicaRepository.deleteById(id);
		
	}

}
