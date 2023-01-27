package com.academiadigital.entityDTO;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaUpdateDto {
	
	
	@NotNull(message = "O Campo nome não pode estar vazio")
	@Positive(message = "O Campo nome não pode ser negativo")
	private Double peso;
	
	@NotNull(message = "O Campo nome não pode estar vazio")
	@Positive(message = "O Campo nome não pode ser negativo")
	@DecimalMin(value = "100", message = "'${validatedValue}' precisa ser minino {value}")
	private Double altura;

}
