package com.academiadigital.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AvaliacaoFisica {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne @JoinColumn(name = "aluno_id")
	private Aluno aluno;
	
	private Double peso;
	
	private Double altura;
	
	private LocalDateTime dataAvaliacao = LocalDateTime.now();
}
