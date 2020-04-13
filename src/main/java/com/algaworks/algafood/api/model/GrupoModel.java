package com.algaworks.algafood.api.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GrupoModel {
	
	@NotNull
	private Long id;
	
	@NotBlank
	private String nome;

}
