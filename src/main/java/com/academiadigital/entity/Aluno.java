package com.academiadigital.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Aluno {

	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	

	private String cpf;
	
	private String bairro;
	
	private LocalDate dataNascimento;
	
	@OneToMany(mappedBy = "aluno", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY) @JsonIgnore
	private List<AvaliacaoFisica> avaliacoes = new ArrayList<AvaliacaoFisica>();
}
