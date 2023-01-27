package com.academiadigital.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.academiadigital.entity.AvaliacaoFisica;
@Repository
public interface AvaliacaoFisicaRepository extends CrudRepository<AvaliacaoFisica, Long>{

}
