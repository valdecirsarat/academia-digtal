package com.academiadigital.entityDTO;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoUpdateDto {

	
	@NotEmpty(message = "O Campo nome não pode estar vazio")
	@Size(min = 3, max = 100, message = "'${validatedValue}', precisa estar entre {min} e {max} caracteres")
	private String nome;
	
	@NotEmpty(message = "Preencha o Campo Bairro corretamente")
	@Size(min = 3, max = 100, message = "'${validatedValue}', precisa estar entre {min} e {max} caracteres")
	private String bairro;
	
	@NotNull(message = "Preencha o Campo Data corretamente")
	@Past(message = "Data '${validatedValue} é invalida!")
	private LocalDate dataNascimento;

}
