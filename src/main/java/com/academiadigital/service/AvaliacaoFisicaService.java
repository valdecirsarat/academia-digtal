package com.academiadigital.service;

import java.util.Optional;

import com.academiadigital.entity.AvaliacaoFisica;
import com.academiadigital.entityDTO.AvaliacaoFisicaDto;
import com.academiadigital.entityDTO.AvaliacaoFisicaUpdateDto;

public interface AvaliacaoFisicaService {

	
	AvaliacaoFisica create(AvaliacaoFisicaDto avaFisicaDto);
	
	Optional<AvaliacaoFisica> get(Long id);
	
	Iterable<AvaliacaoFisica>getAll();
	
	AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateDto avaUpdateDto);
	
	void delete(Long id);
}
