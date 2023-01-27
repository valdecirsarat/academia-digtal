package com.academiadigital.service;

import com.academiadigital.entity.Matricula;
import com.academiadigital.entityDTO.MatriculaDto;

public interface MatriculaService  {

	Matricula create(MatriculaDto matDto);
	
	Matricula get(Long id);
	
	Iterable<Matricula>getAl();
	
	void delete(Long id);
}
