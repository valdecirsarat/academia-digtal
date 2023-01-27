package com.academiadigital.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.academiadigital.entity.Matricula;
@Repository
public interface MatriculaRepository extends CrudRepository<Matricula, Long>{

}
