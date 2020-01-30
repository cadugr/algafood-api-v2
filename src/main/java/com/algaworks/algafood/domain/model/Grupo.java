package com.algaworks.algafood.domain.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Data
public class Grupo {
	
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	//@JsonIgnore
	@ManyToMany
	@JoinTable(name = "grupo_permissao",
			joinColumns = @JoinColumn(columnDefinition = "grupo_id"),
			inverseJoinColumns = @JoinColumn(columnDefinition = "permissao_id"))
	private List<Permissao> permissoes = new ArrayList<>();

}
