package com.academiadigital.entityDTO;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MatriculaDto implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotNull(message = "Preencha o campo corretamente")
	@Positive(message = "ID aluno precisa ser positivo")
	private Long alunoId;

}
